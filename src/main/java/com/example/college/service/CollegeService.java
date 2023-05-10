package com.example.college.service;

import com.example.college.dao.CollegeRepository;
import com.example.college.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService
{
    @Autowired
    CollegeRepository collegeRepository;

    public College createCollege(College college)
    {
        return collegeRepository.save(college);
    }

    public College getById(Integer id)
    {
        return collegeRepository.findById(id).get();
    }

    public College updateCollege(College college)
    {
        return collegeRepository.save(college);
    }

    public List<College> getAll()
    {
        return collegeRepository.findAll();
    }

    public void deleteById(Integer id)
    {
        collegeRepository.deleteById(id);
    }

    public void deleteAll()
    {
        collegeRepository.deleteAll();
    }

}
