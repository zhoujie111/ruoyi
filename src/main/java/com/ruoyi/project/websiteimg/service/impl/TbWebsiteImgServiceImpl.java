package com.ruoyi.project.websiteimg.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.websiteimg.domain.TbWebsiteImg;
import com.ruoyi.project.websiteimg.mapper.TbWebsiteImgMapper;
import com.ruoyi.project.websiteimg.service.ITbWebsiteImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
@Service
public class TbWebsiteImgServiceImpl implements ITbWebsiteImgService
{
    @Autowired
    private TbWebsiteImgMapper tbWebsiteImgMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteImg selectTbWebsiteImgById(Long id)
    {
        return tbWebsiteImgMapper.selectTbWebsiteImgById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteImg> selectTbWebsiteImgList(TbWebsiteImg tbWebsiteImg)
    {
        return tbWebsiteImgMapper.selectTbWebsiteImgList(tbWebsiteImg);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteImg(TbWebsiteImg tbWebsiteImg)
    {
        tbWebsiteImg.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteImgMapper.insertTbWebsiteImg(tbWebsiteImg);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteImg(TbWebsiteImg tbWebsiteImg)
    {
        tbWebsiteImg.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteImgMapper.updateTbWebsiteImg(tbWebsiteImg);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteImgByIds(String ids)
    {
        return tbWebsiteImgMapper.deleteTbWebsiteImgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteImgById(Long id)
    {
        return tbWebsiteImgMapper.deleteTbWebsiteImgById(id);
    }

    @Override
    public int insert(TbWebsiteImg img) {
        return tbWebsiteImgMapper.insert(img);
    }
}
