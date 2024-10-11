package com.example.catchupplatform.application;

import com.example.catchupplatform.domain.FavoriteSource;
import com.example.catchupplatform.infrastructure.FavoriteSourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteSourceCommandService {

	private final FavoriteSourceRepository repository;

	public FavoriteSource createFavoriteSource(FavoriteSource favoriteSource) {
		return repository.save(favoriteSource);
	}

	public FavoriteSource updateFavoriteSource(Long id, FavoriteSource newSource) {
		return repository.findById(id).map(source -> {
			source.setName(newSource.getName());
			source.setUrl(newSource.getUrl());
			source.setDescription(newSource.getDescription());
			return repository.save(source);
		}).orElseThrow(() -> new RuntimeException("Source not found"));
	}

	public void deleteFavoriteSource(Long id) {
		repository.deleteById(id);
	}
}

@Service
@RequiredArgsConstructor
public class FavoriteSourceQueryService {

	private final FavoriteSourceRepository repository;

	public List<FavoriteSource> getAllFavoriteSources() {
		return repository.findAll();
	}

	public FavoriteSource getFavoriteSourceById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Source not found"));
	}
}

