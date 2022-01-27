package com.poscoict.aoptest.service;

import org.springframework.stereotype.Service;

import com.poscoict.aoptest.vo.ProductVo;

@Service
public class ProductService {
	
	public ProductVo find(String name) {
		System.out.println("[ProductService] finding....");
		
		if(1-1 == 0) {
			throw new RuntimeException("Find Exception");
		}
		return new ProductVo(name);
	}
}
