package com.ek.json2job.resume.items.education;

/**
 * Created by Emile Keith on 1/4/17.
 */
public class School extends BaseEducationItem {
    /*
    Uses 'name' field from parent
    as well as startDate and endDate
     */

    String gpa;
    String summary;
    String address;

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
