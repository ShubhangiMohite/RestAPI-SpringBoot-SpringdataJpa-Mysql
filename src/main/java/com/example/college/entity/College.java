package com.example.college.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document
public class College
{
    @Id
    private Integer collegeId;
    private String collegeName;
    private String collegeAddress;
    private Integer collegeRank;

}
