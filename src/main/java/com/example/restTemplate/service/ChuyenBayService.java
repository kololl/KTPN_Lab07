package com.example.restTemplate.service;

import java.util.List;

import com.example.restTemplate.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> getChuyenBayByDiemDen(String gaDen);

	public List<ChuyenBay> findByDoDaiBetween(int startDoDai, int endDoDai);

	List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaDen);

}
