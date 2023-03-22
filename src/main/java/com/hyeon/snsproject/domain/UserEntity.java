package com.hyeon.snsproject.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String password;
    private String fullName;
//    @Enumerated(EnumType.STRING)
    private String role;
    @Column(unique = true, nullable = false)
    private String nickName;
    private String profileImage;
    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Builder
    public UserEntity(Long id, String email, String password, String fullName, String role, String nickName, String profileImage,
                      String phoneNumber) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.nickName = nickName;
        this.profileImage = profileImage;
        this.phoneNumber = phoneNumber;
    }
}