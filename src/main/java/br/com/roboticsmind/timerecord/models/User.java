package br.com.roboticsmind.timerecord.models;

import jakarta.persistence.Column;

@lombok.Getter
@lombok.Setter
public class User {

    @Column
    private String usuario;
    @Column
    private String name;
}
