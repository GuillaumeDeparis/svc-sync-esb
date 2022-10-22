package com.emothep.esb;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ISPackageTest {
    public IntegrationServer is = new IntegrationServer("default","C:\\softwareag\\IntegrationServer\\instances\\default");

    @Test
    public void testCheckSymlink(){
        ArrayList<ISPackage> listPackage = is.getPackageList();

    }

}