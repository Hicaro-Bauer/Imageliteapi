package io.github.HicaroBauer.imageliteapi.domain.service;

import io.github.HicaroBauer.imageliteapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save(Image image);
    Optional<Image> getById(String id);
}
