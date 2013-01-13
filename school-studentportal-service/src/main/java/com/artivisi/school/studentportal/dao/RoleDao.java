package com.artivisi.school.studentportal.dao;

import com.artivisi.school.studentportal.domain.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleDao extends PagingAndSortingRepository<Role, String> {
}