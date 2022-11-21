package com.dolphin.springboot02config.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dolphin.blog")
public class BlogEntity {
//    @Value("${dolphin.blog.name}")
    private String name;
//    @Value("${dolphin.blog.title}")
    private String title;

    public BlogEntity() {
    }

    public BlogEntity(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BlogEntity{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
