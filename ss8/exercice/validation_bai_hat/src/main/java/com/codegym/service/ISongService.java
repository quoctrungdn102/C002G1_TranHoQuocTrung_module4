package com.codegym.service;

import com.codegym.model.Song;

import java.util.List;

public interface ISongService {
    public List<Song> findAll();

    public void save(Song song);
}
