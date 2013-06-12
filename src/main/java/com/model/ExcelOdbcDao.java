package com.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/6/13
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExcelOdbcDao implements Dao {

    private Connection con;

    @Override
    public void connect() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:CENSUS_DATA");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void disconnect()
    {
        if(con != null)
        {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    public Map<String,Integer> selectAllFipsCodes() {

        Map<String,Integer> fipsCodes = new HashMap<String, Integer>();
        if(con != null )
        {
            try {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("Select * from [Fips_Table$]");

                    while(rs.next())
                    {
                        fipsCodes.put(rs.getString(1), rs.getInt(2));
                    }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fipsCodes;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public List<FsData> selectAllFoodStampPercents() {
        List<FsData> data = new ArrayList<FsData>();
        if(con != null )
        {
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select * from [county_fips_fs$]");

                while(rs.next())
                {
                    data.add( new FsData(rs.getInt(1), rs.getFloat(2)));

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
