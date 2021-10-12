package com.stackroute.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;

/* Add annotation to declare this class as Service class.
 * Also it should implement BlogService Interface and override all the implemented methods.*/

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;

	@Override
	public Blog saveBlog(Blog blog) {
		return blogRepository.save(blog);
	}

	@Override
	public List<Blog> getAllBlogs() {
		return (List<Blog>) blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(int id) {
		return blogRepository.findById(id).orElse(null);
	}

	@Override
	public Blog deleteBlog(int id) {
		Blog blog = blogRepository.findById(id).orElse(null);
		blogRepository.deleteById(id);
		return blog;
	}

	@Override
	public Blog updateBlog(Blog blog) {
		return blogRepository.save(blog);
	}

}
