package com.transactionservice.transactionservice.repositories;

import java.time.LocalDateTime;
import com.transactionservice.transactionservice.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

    List<Transfer> findByFromAccount_AccountidAndTxntimestampBetween(
            Long fromAccountId,
            LocalDateTime from,
            LocalDateTime to
    );

    List<Transfer> findByToAccount_AccountidAndTxntimestampBetween(
            Long toAccountId,
            LocalDateTime from,
            LocalDateTime to
    );
}
