package com.geekbrains.hibernate;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    //@OneToMany(mappedBy = "crs_id")
    int id;

    @Column(name = "name")
    String name;

    @ManyToMany
    @JoinTable(
            name = "visitors",
            joinColumns = @JoinColumn(name = "crs_id"),
            inverseJoinColumns = @JoinColumn(name = "std_id")
    )
    //@ManyToMany(mappedBy = "courses")
    //@Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString(){
        String allStudents = "";
        for (Student o: students) {
            allStudents += o.getSurname() + " ";
        }
        return "Course [" + id + " " + name + " " + "[ " + allStudents +  "] ]";
    }
}
