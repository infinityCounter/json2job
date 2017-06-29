package com.ek.json2job.resume.items.education;

import com.ek.json2job.resume.items.BaseResumeItem;

/**
 * Created by Emile Keith on 1/4/17.
 */
public class BaseEducationItem extends BaseResumeItem {
    String name;

    String startDate;
    String endDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}
