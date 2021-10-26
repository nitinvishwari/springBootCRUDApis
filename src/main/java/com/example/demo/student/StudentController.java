package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @DeleteMapping(path = "/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping
    @RequestMapping(path = "/update/{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required = false) String name, @RequestParam(required = false) String email){
        studentService.updateStudent(studentId, name, email);
    }


    @GetMapping
    @RequestMapping(path = "/chinni")
    public List<String> getChinni(){
        return List.of(
                "You are good to go"
        );
    }
}
