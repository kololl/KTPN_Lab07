package com.example.restTemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restTemplate.service.ChungNhanService;

@RestController
@RequestMapping("/api")
public class ChungNhanController {
	private ChungNhanService chungNhanDao;

	@Autowired
	public ChungNhanController(ChungNhanService chungNhanDao) {
		super();
		this.chungNhanDao = chungNhanDao;
	}

	// Get: MaNV by LoaiMayBay
	@GetMapping("/nhanvien")
	public List<String> getMayBayByTamBay(@RequestParam String loaiMayBay) {
		System.out.println(loaiMayBay);
		return chungNhanDao.findMaNhanVienByMayBay(loaiMayBay);

	}

}
