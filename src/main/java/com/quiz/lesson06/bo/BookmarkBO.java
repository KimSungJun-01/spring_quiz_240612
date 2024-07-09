package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.Bookmark;
import com.quiz.lesson06.mapper.BookmarkMapper;

@Service
public class BookmarkBO {
	
	@Autowired
	private BookmarkMapper bookmarkMapper;
	
	// input : name, url
	// output : x
	public void addBookmark(String name, String url) {
		bookmarkMapper.insertBookmark(name, url);
	}
		
	// input : x
	// output : List<Bookmark>
	public List<Bookmark> getBookmarkList() {
		return bookmarkMapper.selectBookmarkList();
	}
}