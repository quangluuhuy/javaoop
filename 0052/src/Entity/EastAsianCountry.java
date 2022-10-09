/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author admin
 */
public class EastAsianCountry extends Country{
    private String countryTerrain;

    public EastAsianCountry(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsianCountry() {
    }

    public EastAsianCountry( String countryCode, String countryName, float totalArea,String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    @Override
    public void display() {
         System.out.printf("%-10s%-25s%-19.0f%-24s\n", getCountryCode(),
                getCountryName(), getTotalArea(), this.countryTerrain);
    }

  
   
}
