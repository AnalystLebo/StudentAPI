/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lebohang;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tapea
 */
@RestController
@RequestMapping("/students")
public class StudentController { 
    
    // In memory list of students ( acts as our database for now)
   private List<Student> students = new ArrayList<>();
   
   //Constructor- adds some sample data
   public StudentController(){
       students.add(new Student(1, "Lebohang Tapeane", "Networking Systems", 3.8));
       students.add(new Student(2,"Prudence Tapeane", "Logistics & Supply Chain", 3.5));
       students.add(new Student(3, "Tshepiso Tapeane", "Bachelor of Accounting", 3.9));
       students.add(new Student(4, "Jane Smith", "Computer Science", 3.6));
       students.add(new Student(5, "Lihle Vuyo","Humaities", 3.2));
       
    }
  
   // GET- fetch all students
   @GetMapping
   public List<Student>getAllStudents() {
       return students;
  }
    //GET- fetch one student by ID
   @GetMapping("/{id}")
   public Student getStudentById(@PathVariable int id) {
     return students.stream()
           .filter(s -> s.getId() == id)
           .findFirst()
           .orElse(null);
   }
   
   //POST - add a new student
   @PostMapping
   public Student addStudent(@RequestBody Student student) {
       students.add(student);
       return student;
   }
   
   //DELETE - remove a studnet by ID
   @DeleteMapping("/{id}")
   public String deleteStudent(@PathVariable int id) {
       students.removeIf(s -> s.getId() == id);
       return "Student" + id + "delete successfully";
   }
}
    
