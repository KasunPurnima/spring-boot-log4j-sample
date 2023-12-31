package com.example.log4j2sample.Repo;

import com.example.log4j2sample.Entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountRepo extends JpaRepository<AccountDetails, Long> {

    List<AccountDetails> findByAccountNumber(String accountNumber);

}
