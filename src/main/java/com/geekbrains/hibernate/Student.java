package com.geekbrains.hibernate;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    //@OneToMany(mappedBy = "std_id")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private int id;

    @Column(name = "surname")
    private String surname;


    @ManyToMany
    @JoinTable(
            name = "visitors",
            joinColumns = @JoinColumn(name = "std_id"),
            inverseJoinColumns = @JoinColumn(name = "crs_id")
    )
    //@Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    @Override
//    public String toString(){
//        return "Student ["+id+" "+surname+"]";
//    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
//    public List<Visitor> getVisitors() {
//        return visitors;
//    }
//
//    public void setVisitors(List<Visitor> visitors) {
//        this.visitors = visitors;
//    }

    @Override
    public String toString(){
        String allCourses = "";
        for (Course o: courses) {
            allCourses += o.getName() + " ";
        }
        return "Student [" + id + " " + surname + " " + "[ " + allCourses +  "] ]";
    }
}
