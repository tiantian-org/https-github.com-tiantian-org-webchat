package com.example.demo.conf;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileUploadConf {
	@Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();

        //factory.setMaxFileSize(1024);
        //单个文件最大
        factory.setMaxFileSize("10240MB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("102400MB");
        return factory.createMultipartConfig();
    }
}
