package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.GiftEntity;

public interface GiftRepo extends JpaRepository<GiftEntity, Integer> {

}
