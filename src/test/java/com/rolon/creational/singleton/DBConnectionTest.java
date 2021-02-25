package com.rolon.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DBConnectionTest {

    @Test
    @DisplayName("Check singleton instance")
    void checkDBConnectionInstance(){
        DBConnection dbConnection1=DBConnection.getDbConnection();
        DBConnection dbConnection2=DBConnection.getDbConnection();
        Assertions.assertEquals(dbConnection1,dbConnection2);
    }
}
