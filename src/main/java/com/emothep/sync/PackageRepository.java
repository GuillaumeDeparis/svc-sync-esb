package com.emothep.sync;

import com.emothep.esb.ISPackage;

import java.nio.file.Path;

public class PackageRepository extends ISPackage {
    private String name;
    private String repoName;
    private String svc_url;
    private String tag;
    private boolean isUpdated;

    public PackageRepository(Path packagePath) {
        super(packagePath);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getSvc_url() {
        return svc_url;
    }

    public void setSvc_url(String svc_url) {
        this.svc_url = svc_url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isUpdated() {
        return isUpdated;
    }

    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }
}
