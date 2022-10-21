package com.emothep.esb;

public class ISPackage {
    private String name;
    private String version;
    private boolean isSymlink;

    public ISPackage(String name){
        this.name = name;
        this.getVersion();
        this.checkSymlink();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isSymlink() {
        return isSymlink;
    }

    public void setSymlink(boolean symlink) {
        isSymlink = symlink;
    }

    private void checkSymlink(){
        if(true)
            this.isSymlink = true;
        else
            this.isSymlink = false;

    }
}
