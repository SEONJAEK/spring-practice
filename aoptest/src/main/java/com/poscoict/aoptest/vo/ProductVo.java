package com.poscoict.aoptest.vo;

import org.springframework.stereotype.Service;

@Service
public class ProductVo {
	private String name;
	
	public ProductVo(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
