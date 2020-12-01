package com.nishant.shoppingcart.models;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishant.shoppingcart.models.data.Page;

public interface PageRepository extends JpaRepository<Page, Integer>{
	
	Page findBySlug(String slug);
	
//	@Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
//	Page findBySlug(int id, String slug);
	
	Page findBySlugAndIdNot(String slug, int id); // equivalent to above commented line

	List<Page> findAllByOrderBySortingAsc();
}