package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class VendorMapper implements RowMapper<Vendor> {
   public Vendor mapRow(ResultSet rs, int rowNum) throws SQLException {
      Vendor Vendor = new Vendor();
      Vendor.setVendor_num(rs.getInt("vendor#"));
      Vendor.setVendor_name(rs.getString("vendor_name"));
      Vendor.setVersion(rs.getInt("version"));
      return Vendor;
   }
}
