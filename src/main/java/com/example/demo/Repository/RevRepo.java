package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Growth;

public interface RevRepo extends JpaRepository<Growth,Integer>{

}
