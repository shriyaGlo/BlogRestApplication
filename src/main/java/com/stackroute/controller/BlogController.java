package com.stackroute.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.domain.Blog;
import com.stackroute.service.BlogService;

/* Add annotation to declare this class as REST Controller */
@RestController
@RequestMapping("api/v1")
public class BlogController {

	@Autowired
	BlogService blogService;
    /* Provide implementation code for these methods */

    /*This method should save blog and return savedBlog Object */
	@PostMapping("/blog")
    public Blog saveBlog(@RequestBody Blog blog) {
        return blogService.saveBlog(blog);
    }

    /*This method should fetch all blogs and return the list of all blogs */
	@GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    /*This method should fetch the blog taking its id and return the respective blog */
	@GetMapping("/blog/{blogId}")
    public Blog getBlogById(@PathVariable int blogId){
        return blogService.getBlogById(blogId);
    }

    /*This method should delete the blog taking its id and return the deleted blog */
	@DeleteMapping("/blog/{blogId}")
    public Blog getBlogAfterDeleting(@PathVariable int blogId) {
        return blogService.deleteBlog(blogId);
    }

    /*This method should update blog and return the updatedBlog */
	@PutMapping("/blog")
    public Blog updateBlog(@RequestBody Blog blog) {
        return blogService.updateBlog(blog);
    }
}