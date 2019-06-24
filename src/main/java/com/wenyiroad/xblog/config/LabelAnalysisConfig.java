package com.wenyiroad.xblog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 大数据服务配置
 *
 * @author xiang.wei
 */
@Configuration
public class LabelAnalysisConfig {

    @Value("${labelAnalysis.baseUrl}")
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
