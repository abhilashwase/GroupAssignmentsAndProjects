/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhilash Wase
 */
public class CustomerDirectory {

    private List<Customer> customerList = new ArrayList<>();

    public CustomerDirectory() {
        //customer id , flight id, customer name, booking id , journey date, seat no , price, FromLoc, ToLoc,SchedTime 
        Customer cust1 = new Customer(110, 123, "Abhilash", 12345, "2020-11-20", "1A", 100, "BOS", "NHS", "8:00 PM");
        Customer cust2 = new Customer(120, 111, "Keshav", 23456, "2020-01-01", "2B", 1000, "SF", "BOS", "10:00 AM");
        Customer cust3 = new Customer(123, 143, "Ajith", 34567, "2020-12-25", "24B", 800, "DAL", "SMF", "8:30 PM");
        Customer cust4 = new Customer(140, 456, "Vardhana", 45678, "2020-11-30", "25F", 1200, "OAK", "SFO", "8:00 PM");
        Customer cust5 = new Customer(159, 874, "Sumesh", 56789, "2020-03-12", "5D", 1300, "DEN", "SJC", "6:30 AM");
        Customer cust6 = new Customer(168, 285, "Krishna", 67891, "2020-02-28", "7E", 300, "SF", "NHS", "8:00 PM");
        Customer cust7 = new Customer(171, 753, "Bryan", 01112, "2020-11-15", "15C", 500, "DAL", "SFO", "8:00 PM");
        Customer cust8 = new Customer(129, 125, "Neel", 13141, "2020-08-25", "6D", 700, "SF", "OAK", "9:00 AM");
        Customer cust9 = new Customer(800, 896, "Sayali", 51617, "2020-12-16", "2F", 400, "SJC", "SMF", "6:00 PM");
        Customer cust10 = new Customer(100, 412, "Palak", 18192, "2020-12-13", "18E", 950, "OAK", "NHS", "3:00 AM");
        Customer cust11 = new Customer(110, 753, "Sunny", 02122, "2020-08-07", "16D", 680, "DAL", "SFO", "2:00 AM");
        Customer cust12 = new Customer(168, 145, "Avinash", 33343, "2020-12-01", "16A", 800, "DEN", "SJC", "12:00 AM");

        customerList.add(cust1);
        customerList.add(cust2);
        customerList.add(cust3);
        customerList.add(cust4);
        customerList.add(cust5);
        customerList.add(cust6);
        customerList.add(cust7);
        customerList.add(cust8);
        customerList.add(cust9);
        customerList.add(cust10);
        customerList.add(cust11);
        customerList.add(cust12);

    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

}
