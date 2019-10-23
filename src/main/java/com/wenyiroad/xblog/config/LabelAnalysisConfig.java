package com.wenyiroad.xblog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LabelAnalysisConfig {

//    @Value("${labelAnalysis.baseUrl}")
//    private String baseUrl;
    private static  String baseUrl="http://10.70.16.75:18080/";

    public String getBaseUrl() {
        return baseUrl;
//        return "http://:192.168.0.122:8080";
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
