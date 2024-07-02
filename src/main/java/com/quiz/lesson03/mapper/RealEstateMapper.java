package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {
	
	// input : id
	// output : RealEstate
	public RealEstate selectRealEstateById(int id);
	
	// input : rent_price
	// output : List<RealEstate>
	public List<RealEstate> selectRealEstateByRentPrice(int rentPrice);
	
	// input : area, price
	// output : List<RealEstate>
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area, 
			@Param("price") int price);
	
	// input : RealEstate
	// output : int
	public int insertRealEstate(RealEstate realEstate);
	
	// input : addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120)
	// output : int
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId, 
			@Param("address") String address, 
			@Param("area") int area,
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") Integer rentPrice);
	
	// input : id, type, price
	// output : int
	public int updateRealEstateById(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
	
	// int : id
	// output : int
	public int deleteRealEstateById(int id);
}
