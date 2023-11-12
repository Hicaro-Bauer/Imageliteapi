package io.github.HicaroBauer.imageliteapi.application.images;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1/images")
@Slf4j
public class ImagesController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ImagesController.class);

    @PostMapping
    public ResponseEntity save(@RequestParam("file") MultipartFile file, @RequestParam("name") String name, @RequestParam("tags") List<String> tags){
        log.info("Imagem recebida: name: {}, size: {}", file.getOriginalFilename(), file.getSize());
        log.info("Nome definido para a imagem: {}", name);
        log.info("Tags: {}", tags);
        return ResponseEntity.ok().build();
    }

}
