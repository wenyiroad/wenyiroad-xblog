package com.wenyiroad.xblog.service;


import com.wenyiroad.xblog.config.LabelAnalysisConfig;
import com.wenyiroad.xblog.remote.LabelAnalysisClient;
import com.wenyiroad.xblog.utils.RetrofitUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class ModelLabelService {



    private static Logger logger = LoggerFactory.getLogger(ModelLabelService.class);

    @Autowired
    private LabelAnalysisConfig labelAnalysisConfig;
    private LabelAnalysisClient labelAnalysisClient;

    @PostConstruct
    public void init() {
        labelAnalysisClient = RetrofitUtils.create(labelAnalysisConfig.getBaseUrl(), LabelAnalysisClient.class);
    }




}
