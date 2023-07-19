package com.inventarioApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventarioApi.Entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
