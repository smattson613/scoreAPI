package dev.mattson.scoreAPI;

import dev.mattson.entities.Score;
import dev.mattson.repos.ScoreRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;

    @Test
    void add_score(){
        Score score = new Score(0,1000,"SJM");
        Score savedScore = this.scoreRepo.save(score);
        Assertions.assertNotEquals(0,savedScore.getId());
    }

    @Test
    void all_scores(){
        Score score1 = new Score(0,1000,"SJM");
        Score savedScore1 = this.scoreRepo.save(score1);

        Score score2 = new Score(0,1000,"SJM");
        Score savedScore2 = this.scoreRepo.save(score2);

        Score score3 = new Score(0,1000,"SJM");
        Score savedScore3 = this.scoreRepo.save(score3);

        List<Score> score = this.scoreRepo.findAll();
        System.out.println(score);
        Assertions.assertEquals(3,score.size());
    }
}
