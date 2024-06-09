package com.enes.marathonproject.repository;

import com.enes.marathonproject.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
