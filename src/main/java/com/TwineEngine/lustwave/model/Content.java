package com.TwineEngine.lustwave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
import jakarta.persistence.ManyToOne;

@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;

    @ManyToOne
    private User creator;

    public Content() {
    }

    public Content(String title, String body, User creator) {
        this.title = title;
        this.body = body;
        this.creator = creator;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", creator=" + creator.getUsername() +
                '}';
    }
}
