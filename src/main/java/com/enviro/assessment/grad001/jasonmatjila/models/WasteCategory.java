package com.enviro.assessment.grad001.jasonmatjila.models;
import javax.persistence.*;

import org.springframework.stereotype.Indexed;

@Entity 
@Table(name = "waste_categories")
public class WasteCategory {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'description'
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
