package com.example.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Date;

public class UpdateDate {
    public static void main(String[] args) {
        try (
                Connection con = MyDatabase.getConnection();
                Statement stmt = con.createStatement();) {
            // Date object creation
            // Date doj = Date.valueOf(LocalDate.now());
            Date doj = Date.valueOf(LocalDate.of(2001, 3, 16)); // custom date

            // Oracle db
            // String sql = "update emp set doj = to_date('" + doj + "','YYYY-MM-DD')" + "
            // where doj is null";
            // MySql (STR_TO_DATE)
            // String sql = "update emp set doj = '" + doj + "' where doj is null";
            String sql = "update emp set doj = '" + doj + "'  where emp_id = 100";
            System.out.println(sql);
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
