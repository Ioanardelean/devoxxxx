package fr.formation.devoxx.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String period;

    public Customer() {
	//
    }

    @Override
    public String toString() {
	return "Customer [firstname=" + firstname + ", lastname=" + lastname
		+ ", period=" + period + "]";
    }

    private void setId(Long id) {
	this.id = id;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public void setPeriod(String period) {
	this.period = period;
    }
}
