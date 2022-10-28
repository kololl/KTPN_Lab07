
package com.example.restTemplate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.restTemplate.entity.ChungNhan;


public interface ChungNhanRepository extends JpaRepository<ChungNhan, Integer> {
	//Cho biết mã số của các phi công lái máy báy Boeing
	
	@Query(value = "select manv from chungnhan INNER JOIN maybay ON chungnhan.mamb=maybay.mamb where maybay.loai LIKE %:loaiMayBay%", nativeQuery = true)
	List<String> findMaNhanVienByMayBay(@Param("loaiMayBay") String loaiMayBay);
	
	
	
}
