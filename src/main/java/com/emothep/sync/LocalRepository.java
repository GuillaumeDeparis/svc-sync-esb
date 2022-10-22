package com.emothep.sync;

public class LocalRepository {
    private String repoPath;
    private String name;

    public LocalRepository(String name, String repoPath){
        this.setName(name);
        this.setRepoPath(repoPath);
    }

    public String getRepoPath() {
        return repoPath;
    }

    public void setRepoPath(String repoPath) {
        this.repoPath = repoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
