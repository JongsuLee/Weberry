package com.weberry.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weberry.backend.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, String>{
	
	List<Image> findAllByPostId(long postid);
	
	Image findByDataId(String data);
	
	Image findByImageUrl(String imageUrl);
	
}
