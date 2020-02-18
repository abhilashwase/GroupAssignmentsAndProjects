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
        Customer cust1 = new Customer(110, 123, "Ram", 12345, "2019-11-20", "1A", 100,"BOS","NHS","8:00 PM");
        Customer cust2 = new Customer(120, 111, "Steve", 23456, "2020-01-01", "2B", 1000,"SF","BOS","10:00 AM");
        Customer cust3 = new Customer(123, 143, "Rog", 34567, "2019-12-25", "24B", 800,"DAL","SMF","8:30 PM");
        Customer cust4 = new Customer(140, 456, "Ran", 45678, "2019-11-30", "25F", 1200,"OAK","SFO","8:00 PM");
        Customer cust5 = new Customer(159, 874, "Vaish", 56789, "2020-03-12", "5D", 1300,"DEN","SJC","6:30 AM");
        Customer cust6 = new Customer(168, 285, "Rithika", 67891, "2020-02-28", "7E", 300,"SF","NHS","8:00 PM");
        Customer cust7 = new Customer(171, 753, "Rory", 01112, "2019-11-15", "15C", 500,"DAL","SFO","8:00 PM");
        Customer cust8 = new Customer(129, 125, "Sai", 13141, "2020-08-25", "6D", 700,"SF","OAK","9:00 AM");
        Customer cust9 = new Customer(800, 896, "Sunny", 51617, "2019-12-16", "2F", 400,"SJC","SMF","6:00 PM");
        Customer cust10 = new Customer(100, 412, "Prateek", 18192, "2019-12-13", "18E", 950,"OAK","NHS","3:00 AM");
        Customer cust11 = new Customer(110, 753, "Pranay", 02122, "2020-08-07", "16D", 680,"DAL","SFO","2:00 AM");
        Customer cust12 = new Customer(129, 743, "James", 23242, "2020-06-13", "15A", 700,"DEN","OAK","8:00 PM");
        Customer cust13 = new Customer(138, 896, "Claire", 52627, "2020-07-25", "25F", 1000,"SMF","SJC","9:00 AM");
        Customer cust14 = new Customer(147, 437, "Damon", 28293, "2019-10-30", "6A", 300,"SF","NHS","6:00 AM");
        Customer cust15 = new Customer(157, 963, "Stefan", 03132, "2019-11-21", "18F", 600,"OAK","SFO","9:00 PM");
        Customer cust16 = new Customer(168, 145, "Nina", 33343, "2019-12-01", "16A", 800,"DEN","SJC","12:00 AM");
        Customer cust17 = new Customer(176, 489, "Klaus", 53637, "2020-01-09", "11D", 850,"SF","NHS","4:00 PM");
        
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
        customerList.add(cust13);
        customerList.add(cust14);
        customerList.add(cust15);
        customerList.add(cust16);
        customerList.add(cust17);        
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
}
