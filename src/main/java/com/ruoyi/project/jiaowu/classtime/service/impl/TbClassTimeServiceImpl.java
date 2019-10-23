package com.ruoyi.project.jiaowu.classtime.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.classtime.domain.TbClassTime;
import com.ruoyi.project.jiaowu.classtime.mapper.TbClassTimeMapper;
import com.ruoyi.project.jiaowu.classtime.service.ITbClassTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 上课时间Service业务层处理
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Service
public class TbClassTimeServiceImpl implements ITbClassTimeService
{
    @Autowired
    private TbClassTimeMapper tbClassTimeMapper;

    /**
     * 查询上课时间
     * 
     * @param id 上课时间ID
     * @return 上课时间
     */
    @Override
    public TbClassTime selectTbClassTimeById(Long id)
    {
        return tbClassTimeMapper.selectTbClassTimeById(id);
    }

    /**
     * 查询上课时间列表
     * 
     * @param tbClassTime 上课时间
     * @return 上课时间
     */
    @Override
    public List<TbClassTime> selectTbClassTimeList(TbClassTime tbClassTime)
    {
        return tbClassTimeMapper.selectTbClassTimeList(tbClassTime);
    }

    /**
     * 新增上课时间
     * 
     * @param tbClassTime 上课时间
     * @return 结果
     */
    @Override
    public int insertTbClassTime(TbClassTime tbClassTime)
    {
        tbClassTime.setCreateTime(DateUtils.getNowDate());
        return tbClassTimeMapper.insertTbClassTime(tbClassTime);
    }

    /**
     * 修改上课时间
     * 
     * @param tbClassTime 上课时间
     * @return 结果
     */
    @Override
    public int updateTbClassTime(TbClassTime tbClassTime)
    {
        tbClassTime.setUpdateTime(DateUtils.getNowDate());
        return tbClassTimeMapper.updateTbClassTime(tbClassTime);
    }

    /**
     * 删除上课时间对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbClassTimeByIds(String ids)
    {
        return tbClassTimeMapper.deleteTbClassTimeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除上课时间信息
     * 
     * @param id 上课时间ID
     * @return 结果
     */
    @Override
    public int deleteTbClassTimeById(Long id)
    {
        return tbClassTimeMapper.deleteTbClassTimeById(id);
    }
}
