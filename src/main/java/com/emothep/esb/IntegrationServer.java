package com.emothep.esb;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IntegrationServer {

    private static final Logger logger = LogManager.getLogger(IntegrationServer.class);
    private String name;
    private String sagHome;
    private Path packagePath;

    private ArrayList<ISPackage> packageList = new ArrayList<>();

    public IntegrationServer(){
        this.sagHome = "C:\\softwareag\\IntegrationServer\\instances\\default";
        this.getInstanceName();
        this.setPackagePath();
        this.setPackageList();
    }

    private void getInstanceName(){
        this.name = "default";
    }

    private void setPackagePath(){
        this.packagePath = Paths.get(this.sagHome + System.getProperty("file.separator") + "packages");
    }

    private Path getPackagePath(){
        return this.packagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSagHome() {
        return sagHome;
    }

    public void setSagHome(String sagHome) {
        this.sagHome = sagHome;
    }

    public ArrayList<ISPackage> getPackageList() {
        return this.packageList;
    }

    public void setPackageList(){
        try(Stream<Path> listPackages = Files.walk(this.packagePath,1)){
            listPackages
                    .filter(Files::isDirectory)
                    .forEach(currentPackage ->
                            this.packageList.add(new ISPackage(currentPackage.getFileName().toString())));
        }
        catch (IOException ioException){
            logger.error(ioException);
        }
    }
}
