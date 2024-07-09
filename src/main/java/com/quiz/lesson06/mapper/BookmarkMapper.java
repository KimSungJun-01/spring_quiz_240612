package com.quiz.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.quiz.lesson06.domain.Bookmark;

@Mapper
public interface BookmarkMapper {
	// input : name, url
	// output : x
	public void insertBookmark(
			@Param("name") String name,
			@Param("url") String url);
		
	// input : x
	// output : List<Bookmark>
	public List<Bookmark> selectBookmarkList();
}
