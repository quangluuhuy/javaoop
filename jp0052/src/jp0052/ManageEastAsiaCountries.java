/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp0052;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageEastAsiaCountries {
    private final Validation validation;
    private final List<Country> countries;
    private final Scanner scanner;

    public ManageEastAsiaCountries() {
        scanner = new Scanner(System.in);
        this.validation = new Validation(scanner);
        this.countries = new ArrayList<>();
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        while (true) {
            int choice = manager.showMenuAndChoice(); // show menu and choice
            switch (choice) {
                case 1:
                    manager.addCountry();
                    break;
                case 2:
                    manager.displayRecentlyCountry();
                    break;
                case 3:
                    manager.searchByName();
                    break;
                case 4:
                    List<Country> countries = manager.sortInformationByAscendingOrder();
                    manager.displayAllCountry(countries);
                    break;
                case 5:
                    return;
            }
        }
    }

    private int showMenuAndChoice() {
        System.out.println("                            MENU\n"
                + "==========================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "==========================================================================\n"
        );
        int choice = validation.checkInt("Enter your choice: ", 1, 5);
        return choice;
    }

    private boolean isCountryExist(String code) {
        for (Country eac : countries) {
            if (eac.getCountryCode().equalsIgnoreCase(code)) { // if key is exist
                return true; // exist that country
            }
        }
        return false;
    }

    public void addCountry() {
        String code = validation.checkString("Enter code of country: ");
        while (isCountryExist(code)) {
            System.err.println("Country existed!");
            code = validation.checkString("Enter code of country: ");
        }
        String name = validation.checkString("Enter name of country: ");
        float area = validation.checkFloat("Enter total Area: ", 0, Float.POSITIVE_INFINITY);
        String terain = validation.checkString("Enter terrain of country: ");
        Country newCountry = new EastAsiaCountries(code, name, area, terain);
        try {
            addCountryInformation(newCountry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void addCountryInformation(Country country) throws Exception {
        if (country == null) {
            throw new NullPointerException("New country is null");
        }
        if (isCountryExist(country.getCountryCode())) {
            throw new Exception("Country is existed");
        }

        countries.add(country);
    }

    public void displayRecentlyCountry() {
        Country result = getRecentlyEnteredInformation();
        if (result != null) {
            displayAllCountry(Arrays.asList(result));
        }
    }

    private Country getRecentlyEnteredInformation() {
        if (countries.isEmpty()) {
            return null;
        } else {
            return countries.get(countries.size() - 1);
        }

    }
// search country by name

    public void searchByName() {
        String searchName = validation.checkString("Enter the name you want to search for: ");
        List<Country> result = searchInformationByName(searchName);
        displayAllCountry(result);
    }

    private List<Country> searchInformationByName(String name) {
        List<Country> result = new ArrayList<>();
        for (Country eac : countries) {
            if (eac.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                result.add(eac);
            }
        }
        return result;
    }

    public void displayAllCountry(List<Country> countries) {
        if (countries == null || countries.isEmpty()) {
            System.out.println("");
            System.err.println("List is still empty!");

        } else {
            System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
            for (Country eac : countries) {
                eac.display();
            }
        }
    }

    public ArrayList<Country> sortInformationByAscendingOrder() {
//          if (countries.isEmpty()) {
//            return new ArrayList<>(0);
//        } else {
//            List<Country> sortedList = new ArrayList<>(countries);
//            sortedList.sort((c1, c2) -> c1.getCountryName()
//                    .compareToIgnoreCase(c2.getCountryName()));
//
//            return (ArrayList<Country>) sortedList;
//        }
//    }

        if (countries.isEmpty()) {
            return new ArrayList<>(0);
        }
        Collections.sort(countries, (Country o1, Country o2) -> {
            if (o1.getTotalArea() < o2.getTotalArea()) {
                return 1;
            } else if (o1.getTotalArea()> o2.getTotalArea()) {
                return -1;
            }
            else return 0;
        });
        return (ArrayList<Country>) countries;
    }
}
    

    

    

