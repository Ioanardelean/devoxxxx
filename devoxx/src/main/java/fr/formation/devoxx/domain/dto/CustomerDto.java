package fr.formation.devoxx.domain.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDto {

    @NotNull
    @Size(max = 100, message = "{E_MAX_LENGTH_EXCEEDED")
    private String firstname;

    @NotNull
    @Size(max = 100, message = "{E_MAX_LENGTH_EXCEEDED")
    private String lastname;

    @NotNull
    private String period;

    public CustomerDto() {
	//
    }

    public void setFirstname() {
	this.firstname = firstname;
    }

    public void setLastname() {
	this.lastname = lastname;
    }

    public void setPeriod() {
	this.period = period;
    }

    public String getFirstname() {
	return firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public String getPeriod() {
	return period;
    }

    @Override
    public String toString() {
	return "CustomerDto [firstname=" + firstname + ", lastname=" + lastname
		+ ", period=" + period + "]";
    }
}
