package org.ko.dashboard.dto;

import org.ko.dashboard.domain.DayVideoAccessTopnStat;

public class DayVideoAccessTopnStatDTO extends DayVideoAccessTopnStat {

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
