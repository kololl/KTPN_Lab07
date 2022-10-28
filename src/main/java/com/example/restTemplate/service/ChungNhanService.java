package com.example.restTemplate.service;

import java.util.List;



public interface ChungNhanService {
	//Cho biết mã số của các phi công lái máy báy Boeing
		List<String> findMaNhanVienByMayBay(String loaiMayBay);
}
