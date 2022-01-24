package com.example.SpringBootCommunityWeb.domain;

import com.example.SpringBootCommunityWeb.enums.BoardType;
import com.example.SpringBootCommunityWeb.repository.BoardRepository;
import com.example.SpringBootCommunityWeb.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UserTest {
    private final String boardTestTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void init() {
        User user = userRepository.save(User.builder()
                .name("donglee99")
                .password("test")
        .email(email)
        .createDate(LocalDateTime.now())
        .build());

        Board board = boardRepository.save(Board.builder()
        .title(boardTestTitle)
        .subTitle("서브 타이틀")
        .content("콘텐츠")
        .boardType(BoardType.free)
        .createDate(LocalDateTime.now())
        .updateDate(LocalDateTime.now())
        .user(user).build());
    }

    @Test
    public void 생성테스트() {
        User user = userRepository.findByEmail(email);


    }
}