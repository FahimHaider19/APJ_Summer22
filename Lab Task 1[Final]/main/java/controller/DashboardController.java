package controller;

import jsp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class DashboardController {

    public List<Student> students = new ArrayList<>();
    Student s1 = new Student(1, "Haider", 3.92);
    Student s2 = new Student(2, "Sadman", 3.96);
    Student s3 = new Student(3, "Asef", 3.88);

    students.add(s1);
    students.add(s2);
    students.add(s3);

    @RequestMapping("/dashboard")
    public String show() {
        return "dashboard";
    }

    @RequestMapping("/addStudent")
    public String showStudent() {
        return "/WEB-INF/addStudent.jsp";
    }

}
