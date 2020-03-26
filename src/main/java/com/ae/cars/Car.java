package com.ae.cars;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {
    @Id
    @Size(min=1)
    private long id;

    @NotNull
    @Size(min = 4,max = 4)
    private String year;

    @NotNull
    @Size(min=3)
    private String make;

    @NotNull
    @Size(min=1)
    private String model;

    public Car(@Size(min = 1) long id, @NotNull @Size(min = 4, max = 4) String year, @NotNull @Size(min = 3) String make, @NotNull @Size(min = 1) String model) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}