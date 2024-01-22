package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="alien_table", uniqueConstraints = {@UniqueConstraint(name="test_Unique_Constaints", columnNames = {"unique_constaint", "unique_via_annotation"})})
public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Transient
    private String color;

    private int unique_constaint;

    //@Column(name = "unique_constraint_via_annotation", unique = true)
    @Column(name="unique_via_annotation")
    private int unique_constraint_via_annotation;

    public int getUnique_constraint_via_annotation() {
        return unique_constraint_via_annotation;
    }

    public void setUnique_constraint_via_annotation(int unique_constraint_via_annotation) {
        this.unique_constraint_via_annotation = unique_constraint_via_annotation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUnique_constaint() {
        return unique_constaint;
    }

    public void setUnique_constaint(int unique_constaint) {
        this.unique_constaint = unique_constaint;
    }

    //
//    public Alien(int id, String name, String color) {
//        this.id = id;
//        this.name = name;
//        this.color = color;
//    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", unique_constaint=" + unique_constaint +
                ", unique_constraint_via_annotation=" + unique_constraint_via_annotation +
                '}';
    }
}
