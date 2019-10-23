package com.ruoyi.project.jiaowu.classtime.mapper;

import com.ruoyi.project.jiaowu.classtime.domain.TbClassTime;
import java.util.List;

/**
 * 上课时间Mapper接口
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
public interface TbClassTimeMapper 
{
    /**
     * 查询上课时间
     * 
     * @param id 上课时间ID
     * @return 上课时间
     */
    public TbClassTime selectTbClassTimeById(Long id);

    /**
     * 查询上课时间列表
     * 
     * @param tbClassTime 上课时间
     * @return 上课时间集合
     */
    public List<TbClassTime> selectTbClassTimeList(TbClassTime tbClassTime);

    /**
     * 新增上课时间
     * 
     * @param tbClassTime 上课时间
     * @return 结果
     */
    public int insertTbClassTime(TbClassTime tbClassTime);

    /**
     * 修改上课时间
     * 
     * @param tbClassTime 上课时间
     * @return 结果
     */
    public int updateTbClassTime(TbClassTime tbClassTime);

    /**
     * 删除上课时间
     * 
     * @param id 上课时间ID
     * @return 结果
     */
    public int deleteTbClassTimeById(Long id);

    /**
     * 批量删除上课时间
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbClassTimeByIds(String[] ids);
}
