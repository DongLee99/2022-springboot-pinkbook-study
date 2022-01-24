package com.example.SpringBootCommunityWeb.domain;

import com.example.SpringBootCommunityWeb.enums.SocialType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    @Column
    private String principal;

    @Column
    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Builder
    public User(String name, SocialType socialType, String principal, String password, String email, LocalDateTime createDate, LocalDateTime updateDate) {
        this.socialType = socialType;
        this.principal = principal;
        this.name = name;
        this.password = password;
        this.email = email;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
