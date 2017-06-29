package com.ek.json2job.resume.items.education;

import java.util.ArrayList;

/**
 * Created by Emile Keith on 1/4/17.
 */
public class Examination extends BaseEducationItem{
    /*
    Uses 'name' field from parent
    as well as startDate and endDate
     */
    ArrayList<ExaminationSubject> subjects;

    public ArrayList<ExaminationSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<ExaminationSubject> subjects) {
        this.subjects = subjects;
    }
}
