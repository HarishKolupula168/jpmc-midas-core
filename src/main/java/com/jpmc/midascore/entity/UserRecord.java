package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class UserRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float balance;

    protected UserRecord() {}

    public UserRecord(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public float getBalance() { return balance; }
    public void setBalance(float balance) { this.balance = balance; }

    @Override
    public String toString() {
        return String.format("User[id=%d, name='%s', balance='%f'", id, name, balance);
    }
}