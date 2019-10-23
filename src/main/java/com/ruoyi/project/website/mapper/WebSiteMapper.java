package com.ruoyi.project.website.mapper;

import com.ruoyi.project.website.domain.BackToFrontSite;
import com.ruoyi.project.website.domain.WebSiteVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebSiteMapper {
    int insert(WebSiteVo webSiteVo);

    List<BackToFrontSite> findTitleByWebsiteId(BackToFrontSite websiteType);

    List<BackToFrontSite> findTitleByPageWebsiteId(BackToFrontSite websiteType);

    BackToFrontSite findContentByTitleId(BackToFrontSite id);
}
