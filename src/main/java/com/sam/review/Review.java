package com.sam.review;

import com.sam.core.BaseEntity;
import com.sam.course.Course;
import com.sam.user.User;

import javax.persistence.*;

@Entity
public class Review extends BaseEntity {

    @ManyToOne
    private Course course;
    private int rating;
    private String description;
    @ManyToOne
    private User reviewer;

    protected Review()
    {
        super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
