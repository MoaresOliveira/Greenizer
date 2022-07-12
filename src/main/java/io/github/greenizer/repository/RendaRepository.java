package io.github.greenizer.repository;

import io.github.greenizer.entity.RendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendaRepository extends JpaRepository<RendaEntity, Integer> {
}
