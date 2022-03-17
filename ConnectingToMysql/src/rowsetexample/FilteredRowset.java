/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowsetexample;

import java.sql.SQLException;
import java.util.Scanner;
import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.Predicate;

class PricePredicate implements Predicate {

    private float price;

    public PricePredicate(float price) {
        this.price = price;
    }

    public boolean evaluate(RowSet rs) {
        try {
            return rs.getFloat("price") > this.price;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean evaluate(Object o, int i) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean evaluate(Object o, String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/**
 *
 * @author paula
 */
public class FilteredRowset {

    public static void main(String[] args) throws SQLException {
        try (FilteredRowSet fs = RowSetProvider.newFactory().createFilteredRowSet()) {
            fs.setUrl("jdbc:mysql://localhost:3306/bookstoredb");
            fs.setUsername("root");
            fs.setPassword("P@ulmysql");

            fs.setCommand("SELECT * from book;");
            fs.execute();

            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("Enter price[press 0 to stop execution]");
                float price = scan.nextFloat();

                if (price == 0) {
                    break;
                }
                fs.setFilter(new PricePredicate(price));
                fs.beforeFirst();
                
                while(fs.next()){
                    System.out.printf("%-30s %8.1f\n", fs.getString("title"), fs.getFloat("price"));
                }
            }
        }
    }
}
