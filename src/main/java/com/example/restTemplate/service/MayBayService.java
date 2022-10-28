package com.example.restTemplate.service;

import java.util.List;

import com.example.restTemplate.entity.MayBay;



public interface MayBayService {
	List<MayBay> findByTamBayGreaterThan(int tamBay);
	List<MayBay> findByLoaiContaining(String loai);
}
