package dev.mattson.repos;

import dev.mattson.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepo extends JpaRepository<Score, Integer> {
}
