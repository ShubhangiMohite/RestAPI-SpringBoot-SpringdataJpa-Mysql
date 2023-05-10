package com.example.college.controller;

import com.example.college.entity.College;
import com.example.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college-app")
public class CollegeController
{
    @Autowired
    CollegeService collegeService;

    @PostMapping("/createcollege")   //  localhost:8080/college-app/createcollege
    public College createCollege(@RequestBody College college)
    {
        return collegeService.createCollege(college);
    }

    @GetMapping("/getById/{id}")   //  localhost:8080/college-app/getById/1
    public College getById(@PathVariable Integer id)
    {
        return collegeService.getById(id);
    }

    @GetMapping("/getAll")  //  localhost:8080/college-app/getAll
    public List<College> getAll()
    {
        return collegeService.getAll();
    }

    @PutMapping("/updateCollege")
    public College updateCollege(@RequestBody College college)  //  localhost:8080/college-app/updateCollege
    {
        return collegeService.updateCollege(college);
    }

    @DeleteMapping("/deleteCollege/{id}")
    public void deleteStudent(@PathVariable Integer id)  //  localhost:8080/college-app/deleteCollege/1
    {
        collegeService.deleteById(id);
    }


    @DeleteMapping("/deleteAll")  //  localhost:8080/student-app/deleteAll
    public void deleteAll()
    {
        collegeService.deleteAll();
    }


}
