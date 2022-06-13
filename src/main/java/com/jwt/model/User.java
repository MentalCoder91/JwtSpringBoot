package com.jwt.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Data
@Entity
@ToString
@Table(name = "user_master")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "USER_ID")
    private String username;


    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "SDCA_ID")
    private String sdcaId;

    @Column(name = "SSA_ID")
    private String ssaId;

    @Column(name = "CIRCLE_ID")
    private String circleId;

    @Column(name="HRMS_NO")
    private Long hrmsNo;

    @Column(name = "email_id")
    private String email;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



}
