package com.naigoapps.expenses.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movement extends BaseEntity {

    private LocalDate date;

    private double amount;

    @ManyToMany
    @JoinTable(
        name = "movement_contributors",
        joinColumns = @JoinColumn(name = "movement_id"),
        inverseJoinColumns = @JoinColumn(name = "contributor_id"))
    private Set<Contributor> contributors;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Set<Contributor> listContributors(){
        return new HashSet<>(contributors);
    }

    public void addContributor(Contributor contributor){
        contributors.add(contributor);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
