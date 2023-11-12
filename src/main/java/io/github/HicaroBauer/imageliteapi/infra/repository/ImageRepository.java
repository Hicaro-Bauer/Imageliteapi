package io.github.HicaroBauer.imageliteapi.infra.repository;

import io.github.HicaroBauer.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
