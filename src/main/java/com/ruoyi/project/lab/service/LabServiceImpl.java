package com.ruoyi.project.lab.service;

import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.lab.domain.Lab;
import com.ruoyi.project.lab.mapper.LabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabServiceImpl implements LabService{

    @Autowired
    private LabMapper labDao;
    @Override
    public List<Lab> selectlabList(Lab lab) {
        return labDao.selectAll(lab);
    }

    @Override
    public int insertLab(Lab lab) {
        return labDao.insertLab(lab);
    }

    @Override
    public int deleteById(String ids) {
        Long[] testIds = Convert.toLongArray(ids);
        return labDao.deleteTestByIds(testIds);
    }

    @Override
    public Lab selectLabById(Long id) {
        return labDao.selectLabById(id);
    }

    @Override
    public int updateLab(Lab lab) {
        return labDao.updateLab(lab);
    }
}
