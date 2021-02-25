package com.rolon.creational.singleton;

public class DBConnection {
    static DBConnection dbConnection;
    private DBConnection(){

    }
    public static DBConnection getDbConnection() {
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
