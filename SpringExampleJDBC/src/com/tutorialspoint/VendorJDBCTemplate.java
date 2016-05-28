package com.tutorialspoint;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class VendorJDBCTemplate implements VendorDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(Integer vendor_num, String vendor_name, Integer version) {
      String SQL = "insert into Vendor (vendor#, vendor_name, version) values (?, ?, ?)";
      System.out.println( "SQL =====> " + SQL );
      jdbcTemplateObject.update( SQL, vendor_num, vendor_name, version);
      System.out.println("Created Record Num = " + vendor_num + " Name = " + vendor_name + " Sender = " + version);
      return;
   }

   public Vendor getVendor(Integer vendor_num) {
      String SQL = "select * from Vendor where vendor# = ?";
      Vendor vendor = jdbcTemplateObject.queryForObject(SQL, 
                        new Object[]{vendor_num}, new VendorMapper());
      return vendor;
   }

   public List<Vendor> listVendors() {
      String SQL = "select * from Vendor";
      List <Vendor> vendors = jdbcTemplateObject.query(SQL, 
                                new VendorMapper());
      return vendors;
   }

   public void delete(Integer vendor_num){
      String SQL = "delete from Vendor where vendor_num = ?";
      jdbcTemplateObject.update(SQL, vendor_num);
      System.out.println("Deleted Record with ID = " + vendor_num );
      return;
   }

   public void update(Integer vendor_num, Integer version){
      String SQL = "update Vendor set version = ? where vendor# = ?";
      jdbcTemplateObject.update(SQL, vendor_num, version);
      System.out.println("Updated Record with vendor# = " + vendor_num );
      return;
   }

}
