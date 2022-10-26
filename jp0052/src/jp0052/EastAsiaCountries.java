/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp0052;

/**
 *
 * @author admin
 */
public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain) {
        super();
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries() {
        super();
    }

    public EastAsiaCountries(String countryCode, String countryName,
            Float totalArea, String countryTerrain) {
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
        System.out.printf("%-10s%-25s%-19.0f%-24s\n", getCountryCode(), getCountryName(), 
            getTotalArea(), this.countryTerrain);
    }

}