package com.ek.json2job.resume;

import com.google.gson.JsonObject;
import com.ek.json2job.Config;
import com.ek.json2job.resume.items.Person;
import com.ek.json2job.resume.items.Project;
import com.ek.json2job.resume.items.education.Education;
import com.ek.json2job.resume.items.work.JobWork;
import com.ek.json2job.resume.items.work.Referee;
import com.ek.json2job.resume.items.work.VolunteerWork;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * Created by Emile Keith on 12/31/16.
 */
public class Resume {
    Person person;
    Education education;
    String educationHeading;
    ArrayList<JobWork> jobWork;
    String jobWorkHeading;
    ArrayList<VolunteerWork> volunteerWork;
    String volunteerWorkHeading;
    ArrayList<Project> projects;
    String projectsHeading;
    ArrayList<String> skills;
    ArrayList<String> accomplishments;
    String accomplishmentsHeading;
    ArrayList<String> hobbies;
    String hobbiesHeading;
    String skillsHeading;
    String themeName;
    Config config = new Config();
    int numPersonalDetailsColumns = 3;
    transient JsonObject jsonObject;

    String referencesHeading;
    ArrayList<Referee> references;

    String personInfoHeading;
    String phoneHeading;
    String emailHeading;
    String websiteHeading;

    String keySkillsHeading;
    String technicalSkillsHeading;

    public String getPhoneHeading() {
        return phoneHeading;
    }

    public String getEmailHeading() {
        return emailHeading;
    }

    public String getWebsiteHeading() {
        return websiteHeading;
    }

    public void setPhoneHeading(String phoneHeading) {
        this.phoneHeading = phoneHeading;
    }

    public void setEmailHeading(String emailHeading) {
        this.emailHeading = emailHeading;
    }

    public void setWebsiteHeading(String websiteHeading) {
        this.websiteHeading = websiteHeading;
    }

    public String getKeySkillsHeading() {
        return keySkillsHeading;
    }

    public void setKeySkillsHeading(String keySkillsHeading) {
        this.keySkillsHeading = keySkillsHeading;
    }

    public String getTechnicalSkillsHeading() {
        return technicalSkillsHeading;
    }

    public void setTechnicalSkillsHeading(String technicalSkillsHeading) {
        this.technicalSkillsHeading = technicalSkillsHeading;
    }

    public Resume() {
        config = new Config();
    }

    public void getRidOfArraysWithEmptyElements() {
        accomplishments = setArraysWithEmptyStringElementsToNull(accomplishments);
        hobbies = setArraysWithEmptyStringElementsToNull(hobbies);
        skills = setArraysWithEmptyStringElementsToNull(skills);
        if (education != null) {
            education.getRidOfArraysWithEmptyElements();
        }
        volunteerWork = setArraysWithEmptyObjectsToNull(volunteerWork, VolunteerWork.class);
        jobWork = setArraysWithEmptyObjectsToNull(jobWork, JobWork.class);
    }

    private <T> ArrayList<T> setArraysWithEmptyObjectsToNull(ArrayList<T> arrayList, Class<? extends T> impl){
        try{
            Constructor<? extends T> constructor;
            constructor = impl.getConstructor();
            if(arrayList != null){
                for(T obj : arrayList){
                    if(!obj.equals(constructor.newInstance())){
                        return arrayList;
                    }
                }
            }
            return null;
        }
        catch (Exception exc){
            exc.printStackTrace();
            return null;
        }
    }

    private ArrayList<String> setArraysWithEmptyStringElementsToNull(ArrayList<String> list) {
        if (list != null) {
            for (String element : list) {
                String whiteSpaceStripped = element.replaceAll("\\s+", "");
                if (whiteSpaceStripped.length() > 0) {
                    return list;
                }
            }
            return null;
        }
        return null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Referee> getReferences() {
        return references;
    }

    public void setReferences(ArrayList<Referee> references) {
        this.references = references;
    }

    public ArrayList<JobWork> getJobWork() {
        return jobWork;
    }

    public void setJobWork(ArrayList<JobWork> jobWork) {
        this.jobWork = jobWork;
    }

    public String getJobWorkHeading() {
        return jobWorkHeading;
    }

    public void setJobWorkHeading(String jobWorkHeading) {
        this.jobWorkHeading = jobWorkHeading;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public String getProjectsHeading() {
        return projectsHeading;
    }

    public void setProjectsHeading(String projectsHeading) {
        this.projectsHeading = projectsHeading;
    }

    public String getPersonInfoHeading(){return personInfoHeading;}

    public void setPersonInfoHeading(String personInfoHeading){this.personInfoHeading = personInfoHeading;}

    public ArrayList<VolunteerWork> getVolunteerWork() {
        return volunteerWork;
    }

    public void setVolunteerWork(ArrayList<VolunteerWork> volunteerWork) {
        this.volunteerWork = volunteerWork;
    }

    public String getVolunteerWorkHeading() {
        return volunteerWorkHeading;
    }

    public void setVolunteerWorkHeading(String volunteerWorkHeading) {
        this.volunteerWorkHeading = volunteerWorkHeading;
    }

    public String getReferencesHeading() {
        return referencesHeading;
    }

    public void setReferencesHeading(String referencesHeading) {
        this.referencesHeading = referencesHeading;
    }

    public void addJobWork(JobWork jobWork){
        if (this.jobWork == null) {
            this.jobWork = new ArrayList<JobWork>();
        }
        this.jobWork.add(jobWork);
    }
    public void addVolunteerWork(VolunteerWork volunteerWork){
        if (this.volunteerWork == null) {
            this.volunteerWork = new ArrayList<>();
        }
        this.volunteerWork.add(volunteerWork);
    }
    public void addProject(Project project){
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(project);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getSkillsHeading() {
        return skillsHeading;
    }

    public void setSkillsHeading(String skillsHeading) {
        skillsHeading = skillsHeading;
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public int getNumPersonalDetailsColumns() {
        return numPersonalDetailsColumns;
    }

    public void setNumPersonalDetailsColumns(int numPersonalDetailsColumns) {
        this.numPersonalDetailsColumns = numPersonalDetailsColumns;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getEducationHeading() {
        return educationHeading;
    }

    public void setEducationHeading(String educationHeading) {
        this.educationHeading = educationHeading;
    }

    public ArrayList<String> getAccomplishments() {
        return accomplishments;
    }

    public void setAccomplishments(ArrayList<String> accomplishments) {
        this.accomplishments = accomplishments;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getAccomplishmentsHeading() {
        return accomplishmentsHeading;
    }

    public void setAccomplishmentsHeading(String accomplishmentsHeading) {
        this.accomplishmentsHeading = accomplishmentsHeading;
    }

    public String getHobbiesHeading() {
        return hobbiesHeading;
    }

    public void setHobbiesHeading(String hobbiesHeading) {
        this.hobbiesHeading = hobbiesHeading;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
