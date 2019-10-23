package com.ruoyi.project.lab.service;

import com.ruoyi.project.lab.domain.Lab;

import java.util.List;

public interface LabService {

    List<Lab> selectlabList(Lab lab);

    int insertLab(Lab lab);

    int deleteById(String ids);

    Lab selectLabById(Long id);

    int updateLab(Lab lab);
}
