package de.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StackOverflowWebsite {
    @Id
    private final String id;
    private final String website;
    private final String icon;
    private final String title;
    private final String description;

    public StackOverflowWebsite(String id, String website, String ocom, String titie, String description) {
        this.id = id;
        this.website = website;
        this.icon = ocom;
        this.title = titie;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
