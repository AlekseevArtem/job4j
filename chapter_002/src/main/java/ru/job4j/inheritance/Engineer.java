package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String constructionInstitute;
    private boolean accessToProject;
    private String projectName;

    public String getConstructionInstitute() {
        return constructionInstitute;
    }

    public boolean getAccessToProject() {
        return accessToProject;
    }

    public String getProjectName() {
        return projectName;
    }
}
