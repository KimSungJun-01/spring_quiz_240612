package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Seller;
import com.quiz.lesson04.mapper.SellerMapper;

@Service
public class SellerBO {
	
	@Autowired
	private SellerMapper sellerMapper;
	
	// input : 파라미터들
	// output : x
	public void addSeller(String nickname11111, 
			String profileUrl22222, double temperature33333) {
		
		sellerMapper.insertSeller(nickname11111, profileUrl22222, temperature33333);
	}
	
	// input : x
	// output : Seller(채워져 있거나 or null)
	public Seller getLatestSeller() {
		return sellerMapper.selectLatestSeller();
	}
	
	// input : id
	// output : Seller(채워져 있거나 or null)
	public Seller getSellerById(int id) {
		return sellerMapper.selectSellerById(id);
	}
}
