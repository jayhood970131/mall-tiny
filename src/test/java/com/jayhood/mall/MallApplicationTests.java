package com.jayhood.mall;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootTest
public class MallApplicationTests {

    @Test
    public void contextLoads() throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://39.108.48.226:3306/mall?user=root&password=123456");
        // Statement st = conn.createStatement();
        // ResultSet rs = st.executeQuery( "select * from table" );

        System.out.println("Connected?");
    }

}
