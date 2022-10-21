package com.emothep.esb;

import java.nio.file.Path;
import java.util.ArrayList;

public class IntegrationServer {
    private String name;
    private Path sagHome;
    private Path packagePath;

    private ArrayList<ISPackage> packageList;

    public IntegrationServer(){
        this.getInstanceName();
        this.getPackagePath();
        this.getPackageList();
    }

    private void getInstanceName(){
        this.name = "default";
    }

    private void getPackagePath(){

        this.packagePath = Path(this.sagHome + System.lineSeparator() + "packages");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getSagHome() {
        return sagHome;
    }

    public void setSagHome(Path sagHome) {
        this.sagHome = sagHome;
    }

    public ArrayList<ISPackage> getPackageList() {
        return this.packageList;
    }

    public void setPackageList() {
        for (listDir in this.packagePath():
             ) {
            ISPackage currentPackage = new ISPackage(listDir.getName());
            this.packageList.add(currentPackage);
        }
    }
}
