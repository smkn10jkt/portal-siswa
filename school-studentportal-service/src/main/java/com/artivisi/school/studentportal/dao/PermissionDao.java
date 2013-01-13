package com.artivisi.school.studentportal.dao;

import com.artivisi.school.studentportal.domain.Permission;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PermissionDao extends PagingAndSortingRepository<Permission, String> {
    public List<Permission> findByIdNotIn(List<String> ids);
}
