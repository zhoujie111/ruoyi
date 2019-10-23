package com.ruoyi.project.experimentcheck.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.experimentcheck.domain.ExperimentCheck;
import com.ruoyi.project.experimentcheck.service.ExperimentCheckService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/experimentcheck")
public class ExperimentCheckController extends BaseController {

    @Autowired
    private ExperimentCheckService experimentCheckService;

    private String prefix = "experimentcheck";

    @RequiresPermissions("experimentcheck:view")
    @GetMapping()
    public String check()
    {
        return prefix + "/experimentcheck";
    }

    @RequiresPermissions("experimentcheck:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ExperimentCheck experimentCheck)
    {
        startPage();
        List<ExperimentCheck> list = experimentCheckService.selectExperimentCheckList(experimentCheck);
        return getDataTable(list);
    }

}
