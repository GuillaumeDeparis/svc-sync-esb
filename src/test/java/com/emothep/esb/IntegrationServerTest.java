package com.emothep.esb;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IntegrationServerTest {

    public IntegrationServer is = new IntegrationServer("default","C:\\softwareag\\IntegrationServer\\instances\\default");
    @Test
    void getPackageList() {
        ArrayList<ISPackage>  packageList = this.is.getPackageList();
        assertNotNull(packageList);
    }

    @Test
    void getSagHome() {
        assertNotNull(this.is.getSagHome());
        assertTrue(this.is.getSagHome() == "C:\\softwareag\\IntegrationServer\\instances\\default");
    }
}