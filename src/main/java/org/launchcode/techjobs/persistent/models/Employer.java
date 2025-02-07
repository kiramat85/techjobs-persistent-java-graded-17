package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @Size(min = 3, max = 30, message = "location must be in between 3 and 30 characters!")
    @NotBlank(message = "Location must not be blank")
    private String location;
    @JoinColumn(name = "employer_id")
    @OneToMany
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public Employer(List<Job> jobs, String location) {
        this.jobs = jobs;
        this.location = location;
    }

    public @Size(min = 3, max = 30, message = "location must be in between 3 and 30 characters!") @NotBlank(message = "Location must not be blank") String getLocation() {
        return location;
    }

    public void setLocation(@Size(min = 3, max = 30, message = "location must be in between 3 and 30 characters!") @NotBlank(message = "Location must not be blank") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}