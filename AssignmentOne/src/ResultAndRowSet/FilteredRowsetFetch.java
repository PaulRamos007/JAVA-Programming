/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultAndRowSet;

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
public class FilteredRowsetFetch {
    public static void main(String[] args) throws SQLException{
        try (FilteredRowSet fs = RowSetProvider.newFactory().createFilteredRowSet()) {
            fs.setUrl("jdbc:mysql://localhost:3306/restaurantdb");
            fs.setUsername("root");
            fs.setPassword("P@ulmysql");

            fs.setCommand("SELECT * from menuitem where vegetarian = true;");
            fs.execute();
            
            Scanner scan = new Scanner(System.in);
            
            while (true) {
                System.out.println("Enter price[press 0 to stop execution]");
                //User will enter 20
                float price = scan.nextFloat();

                if (price == 0) {
                    break;
                }
                
                fs.setFilter(new PricePredicate(price));
                fs.beforeFirst();
                
                while(fs.next()){
                    System.out.printf("%-10s %-10s %5s %12s\n", fs.getInt("itemID"), fs.getString("itemCategoryID"), fs.getString("description"), fs.getFloat("price"));
                }
            }
        }
    }
}
