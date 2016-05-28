package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tutorialspoint.VendorJDBCTemplate;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      VendorJDBCTemplate vendorJDBCTemplate = 
      (VendorJDBCTemplate)context.getBean("vendorJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      vendorJDBCTemplate.create(44224, "Sperry Cogswell's Cogs", 562);
      vendorJDBCTemplate.create(44778, "JP/Spacely's Sprockets", 563);
      vendorJDBCTemplate.create(44446, "THe New A.C.M.E", 564);

      System.out.println("------Listing Multiple Records--------" );
      List<Vendor> vendors = vendorJDBCTemplate.listVendors();
      for (Vendor record : vendors) {
         System.out.print("Vendor# : " + record.getVendor_num() );
         System.out.print(", Vendor Name : " + record.getVendor_name() );
         System.out.println(", Interchange Sender Id : " + record.getVersion());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      vendorJDBCTemplate.update(44223, 552 );

      System.out.println("----Listing Record with ID = 2 -----" );
      Vendor vendor = vendorJDBCTemplate.getVendor(44777);
      System.out.print("Vendor Num : " + vendor.getVendor_num() );
      System.out.print(", Vendor Name : " + vendor.getVendor_name() );
      System.out.println(", Version : " + vendor.getVersion()); 
	  
   }
}