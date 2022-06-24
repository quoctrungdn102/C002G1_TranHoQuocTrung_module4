package com.codegym.service;

import com.codegym.model.Song;
import com.codegym.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SongService implements ISongService {
    @Autowired
    ISongRepository iSongRepository;
    public List<Song> findAll(){
        return new ArrayList<>(iSongRepository.findAll());
    }
    public void save(Song song){
        iSongRepository.save(song);
    }
}
