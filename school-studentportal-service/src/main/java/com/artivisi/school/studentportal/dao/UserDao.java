package com.artivisi.school.studentportal.dao;

import com.artivisi.school.studentportal.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, String> {
	User findByUsername(String username);
}
