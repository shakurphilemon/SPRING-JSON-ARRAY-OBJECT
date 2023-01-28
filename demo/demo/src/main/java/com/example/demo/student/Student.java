package com.example.demo.student;

import javax.lang.model.element.NestingKind;
import java.time.LocalDate;
//This is my first Constructor
public class Student {
    private Long id;
    private String Name;
    private Integer age;
    private String Email;
    private LocalDate DoG;

    public Student (){

    }

    public Student(Long id,
                   String Name,
                   Integer age,
                   String Email,
                   LocalDate DoG) {
        this.id = id;
        this.Name = Name;
        this.age = age;
        this.Email = Email;
        this.DoG = DoG;

    }

    public Student (String Name,
                    Integer age,
                    String Email,
                    LocalDate DoG){
        this.Name = Name;
        this.age = age;
        this.Email = Email;
        this.DoG = DoG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public LocalDate getDoG() {
        return DoG;
    }
    public void setDoG(LocalDate DoG) {
        this.DoG = DoG;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                ", DoG=" + DoG +
                '}';
    }
}
