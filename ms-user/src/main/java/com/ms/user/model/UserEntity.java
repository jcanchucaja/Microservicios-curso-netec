package com.ms.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    private String id;

    @Column(length = 20)
    private String document;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String email;

    @Column(length = 200)
    private String information;
}
