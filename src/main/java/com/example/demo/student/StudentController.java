package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


//    @Autowired
//    public StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }


    @GetMapping
    @RequestMapping(path = "/nitin")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }


    @GetMapping
    @RequestMapping(path = "/chinni")
    public List<String> getChinni(){
        return List.of(
                "You are good to go"
        );
    }
}
