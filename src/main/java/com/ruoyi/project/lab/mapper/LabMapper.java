package com.ruoyi.project.lab.mapper;

import com.ruoyi.project.lab.domain.Lab;

import java.util.List;

public interface LabMapper {
    List<Lab> selectAll(Lab lab);

    int insertLab(Lab lab);

    int deleteById(String ids);

    int deleteTestByIds(Long[] testIds);

    Lab selectLabById(Long id);

    int updateLab(Lab lab);
}
