/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lebohang;

/**
 *
 * @author tapea
 */
public class Student {
        private int id;
    private String name;
    private String course; 
    private double gpa;
    
  //Constructor
    public Student(int id, String name, String course, double gpa){
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
                
    }
   // Getters and Setters
      public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
 


