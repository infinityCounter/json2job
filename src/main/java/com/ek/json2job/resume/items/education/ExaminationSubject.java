package com.ek.json2job.resume.items.education;

/**
 * Created by Emile Keith on 1/4/17.
 */
public class ExaminationSubject extends BaseEducationItem {
    //Uses 'name' field from BaseEducationItem

    String result;

    public ExaminationSubject(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
