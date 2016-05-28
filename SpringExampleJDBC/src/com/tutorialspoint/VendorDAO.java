package com.tutorialspoint;

import java.util.List;
import javax.sql.DataSource;

public interface VendorDAO {
   /** 
    * This is the method to be used to initialize
    * database resources ie. connection.
    */
   public void setDataSource(DataSource ds);
   /** 
    * This is the method to be used to create
    * a record in the Vendor table.
    */
   public void create(Integer vendor_num, String vendor_name, Integer vendor);
   /** 
    * This is the method to be used to list down
    * a record from the Vendor table corresponding
    * to a passed Vendor id.
    */
   public Vendor getVendor(Integer vendor_num);
   /** 
    * This is the method to be used to list down
    * all the records from the Vendor table.
    */
   public List<Vendor> listVendors();
   /** 
    * This is the method to be used to delete
    * a record from the Vendor table corresponding
    * to a passed Vendor id.
    */
   public void delete(Integer vendor_num);
   /** 
    * This is the method to be used to update
    * a record into the Vendor table.
    */
   public void update(Integer vendor_num, Integer version);
}