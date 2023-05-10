package com.example.college.dao;

import com.example.college.entity.College;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollegeRepository extends MongoRepository<College,Integer>
{

}
