package io.github.HicaroBauer.imageliteapi.application.images;

import io.github.HicaroBauer.imageliteapi.domain.entity.Image;
import io.github.HicaroBauer.imageliteapi.domain.service.ImageService;
import io.github.HicaroBauer.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
