/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author paula
 */
public class AirportDetails {
    
    public String code;
    String city;
    public String country;

    @Override
    public String toString(){
        String res = "";
        res += code;
        res += "(";
        res += city + " , " + country;
        
        res += ")";
        return res;

    }

    public AirportDetails(String code, String city, String country) {
        this.code = code;
        this.city = city;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    
}
