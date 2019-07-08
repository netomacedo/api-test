package com.project.hubspot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Francisco Neto on 07/2018.
 */

/*@JsonIgnoreProperties to any properties not bound in this type should be ignored*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Partner {

    private String firstName;
    private String lastName;
    private String email;
    private String country;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private List<LocalDate> availableDates;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<LocalDate> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<LocalDate> availableDates) {
        this.availableDates = availableDates;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", availableDates=" + availableDates +
                '}';
    }
}
