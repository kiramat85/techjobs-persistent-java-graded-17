package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(max = 500, message = "Description too long!!")
    private String description;
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(String description, List<Job> jobs) {
        this.description = description;
        this.jobs = jobs;
    }

    public @Size(max = 500, message = "Description too long!!") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description too long!!") String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}