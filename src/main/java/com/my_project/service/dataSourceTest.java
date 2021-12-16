package com.my_project.service;
import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;
public class dataSourceTest {
	public class DataSourceTest {
	    
	    @Inject
	    private DataSource dataSource;
	    public void testConnection() throws Exception{
	    	
	        try(Connection conn = dataSource.getConnection()){
	            System.out.println(conn);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	}
}
