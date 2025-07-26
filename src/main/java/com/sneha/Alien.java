package com.sneha;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


// @Table(name = "Alien_data")  for changing table name
//@Cacheable
//@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Alien {
    @Id
   // @Column(name = "a_id")   for changing column name
    private int aid;
    // @Column(name = "a_name")     for changing column name
    private String aname;
    private String tech;

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
