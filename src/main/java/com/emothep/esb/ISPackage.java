package com.emothep.esb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class ISPackage {
    private static final Logger logger = LogManager.getLogger(ISPackage.class);
    private String name;
    private String version;
    private boolean isSymlink;
    private Path packagePath;

    public ISPackage(Path packagePath){
        this.setPackagePath(packagePath);
        this.setName();
        this.getVersion();
        this.checkSymlink();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = this.packagePath.getFileName().toString(); ;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Path getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(Path packagePath) {
        this.packagePath = packagePath;
    }

    public boolean isSymlink() {
        return isSymlink;
    }

    public void setSymlink(boolean symlink) {
        isSymlink = symlink;
    }

    private void checkSymlink() {
        try {
            String realPath = this.packagePath.toRealPath(LinkOption.NOFOLLOW_LINKS).toString();
            String symPath = this.packagePath.toRealPath().toString();
            this.isSymlink = symPath.equals(realPath)?true:false;
        }
        catch(IOException ioException) {
            logger.error(ioException.getMessage());
        }
    }
}
