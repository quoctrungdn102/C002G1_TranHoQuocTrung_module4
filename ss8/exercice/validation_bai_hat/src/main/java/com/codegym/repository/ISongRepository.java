package com.codegym.repository;

import com.codegym.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISongRepository extends JpaRepository<Song,Integer> {

}
