package com.example

import grails.gorm.annotation.Entity

import javax.validation.constraints.NotBlank

@Entity
class Team {
    @NotBlank
    String name
    Date dateCreated
}