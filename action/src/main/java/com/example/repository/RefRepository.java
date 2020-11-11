package com.example.repository;

import com.example.model.Ref;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.UUID;


@NoRepositoryBean
public interface RefRepository<T extends Ref> extends JpaRepository<T, UUID> {
    List<T> findByNameIgnoreCaseContaining(String name);
//    public List<T> find
}
