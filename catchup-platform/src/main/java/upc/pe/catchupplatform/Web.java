package com.example.catchupplatform.web;

import com.example.catchupplatform.application.FavoriteSourceCommandService;
import com.example.catchupplatform.domain.FavoriteSource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@RequiredArgsConstructor
public class FavoriteSourceCommandController {

    private final FavoriteSourceCommandService commandService;

    @PostMapping
    public ResponseEntity<FavoriteSource> createFavorite(@RequestBody FavoriteSource favoriteSource) {
        return ResponseEntity.ok(commandService.createFavoriteSource(favoriteSource));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FavoriteSource> updateFavorite(@PathVariable Long id, @RequestBody FavoriteSource newSource) {
        return ResponseEntity.ok(commandService.updateFavoriteSource(id, newSource));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        commandService.deleteFavoriteSource(id);
        return ResponseEntity.noContent().build();
    }
}

public class FavoriteSourceQueryController {

    private final FavoriteSourceQueryService queryService;

    @GetMapping
    public ResponseEntity<List<FavoriteSource>> getAllFavorites() {
        return ResponseEntity.ok(queryService.getAllFavoriteSources());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FavoriteSource> getFavoriteById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getFavoriteSourceById(id));
    }
}