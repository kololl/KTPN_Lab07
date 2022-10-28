
package com.example.restTemplate.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restTemplate.dao.NhanVienRepository;



@Service
public class NhanVienServiceImpl implements NhanVienService {
	private NhanVienRepository nhanVienRepository;
	
	
	@Autowired
	public NhanVienServiceImpl(NhanVienRepository nhanVienRepository) {
		super();
		this.nhanVienRepository = nhanVienRepository;
	}


	@Override
	public Double getTotalLuong() {
		
		
		return nhanVienRepository.totalLuong();
	}


	


	

	
	

}
