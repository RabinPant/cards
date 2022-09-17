package com.bank.cards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

}
