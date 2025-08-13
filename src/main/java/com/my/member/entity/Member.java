package com.my.member.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    // null 허용안함
    private String name;
    private int age;
    private String address;
}
// -> database의 table이 생김
// table : member
// columns : age id name address