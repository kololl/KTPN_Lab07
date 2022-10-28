package com.example.restTemplate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.restTemplate.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
	@Query(value = "SELECT SUM(luong) AS Total FROM nhanvien;", nativeQuery = true)
	Double totalLuong();

}
