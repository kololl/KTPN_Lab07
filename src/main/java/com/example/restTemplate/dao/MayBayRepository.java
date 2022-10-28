package com.example.restTemplate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restTemplate.entity.MayBay;



public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	List<MayBay> findByTamBayGreaterThan(int tamBay);
	List<MayBay> findByLoaiContaining(String loai);

	
	
}
