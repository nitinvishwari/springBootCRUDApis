package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @RequestMapping(path = "/add")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


    @GetMapping
    @RequestMapping(path = "/chinni")
    public List<String> getChinni(){
        return List.of(
                "You are good to go"
        );
    }
}
