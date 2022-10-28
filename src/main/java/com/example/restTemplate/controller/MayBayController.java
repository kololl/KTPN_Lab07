package com.example.restTemplate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.restTemplate.entity.MayBay;

@RestController
@RequestMapping("/api")
public class MayBayController {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	

	@GetMapping("/so-luong-boing")
	public int numMayBayBeoing() {
		int sl = restTemplate().getForObject("http://localhost:8080/api/so-luong-boing", Integer.class);
		return sl;
	}
	
	
	
//	@Autowired
//	public MayBayController( MayBayService mayBayDao) {
//		super();
//		this.mayBayDao = mayBayDao;
//	}
//
//
//	@GetMapping("/maybay/greaterthan")
//	public List<MayBay> getMayBayByTamBay (@RequestParam int tamBay) {
//		System.out.println(tamBay);
//		return mayBayDao.findByTamBayGreaterThan(tamBay);
//		
//	}
//	
//	@GetMapping("/maybay/loaicontains")
//	public List<MayBay> getMayBayByLoai (@RequestParam String loai) {
//		System.out.println(loai);
//		
//		return mayBayDao.findByLoaiContaining(loai);
//		
//	}

	

	
}


///////////////////////


