package com.TwineEngine.lustwave.service;

import com.TwineEngine.lustwave.model.Content;
import com.TwineEngine.lustwave.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public List<Content> findAll() {
        return contentRepository.findAll();
    }

    // Other content-related methods
}
