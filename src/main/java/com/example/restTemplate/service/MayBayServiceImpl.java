package com.example.restTemplate.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restTemplate.dao.MayBayRepository;
import com.example.restTemplate.entity.MayBay;


@Service
public class MayBayServiceImpl implements MayBayService {
	private MayBayRepository mayBayRepository;
	
	
	@Autowired
	public MayBayServiceImpl(MayBayRepository mayBayRepository) {
		super();
		this.mayBayRepository = mayBayRepository;
	}


	@Override
	public List<MayBay> findByTamBayGreaterThan(int tamBay) {
		List<MayBay> result = mayBayRepository.findByTamBayGreaterThan(tamBay);
		System.out.println("result"  + result);
		
		return result;
	}


	@Override
	public List<MayBay> findByLoaiContaining(String loai) {
		List<MayBay> result = mayBayRepository.findByLoaiContaining(loai);
		System.out.println("result"  + result);
		
		return result;
	}


	

	
	

}
