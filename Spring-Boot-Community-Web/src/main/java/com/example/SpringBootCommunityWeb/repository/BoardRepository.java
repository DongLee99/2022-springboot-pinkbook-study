package com.example.SpringBootCommunityWeb.repository;

import com.example.SpringBootCommunityWeb.domain.Board;
import com.example.SpringBootCommunityWeb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);

    Optional<Board> findById(Long id);
}
