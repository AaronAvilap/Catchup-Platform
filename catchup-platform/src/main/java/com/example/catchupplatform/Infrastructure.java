package com.example.catchupplatform.infrastructure;

import com.example.catchupplatform.domain.FavoriteSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteSourceRepository extends JpaRepository<FavoriteSource, Long> {
}
