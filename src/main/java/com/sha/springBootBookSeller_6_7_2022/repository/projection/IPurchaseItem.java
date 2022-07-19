package com.sha.springBootBookSeller_6_7_2022.repository.projection;

import com.sha.springBootBookSeller_6_7_2022.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IPurchaseItem {
    String getTitle();

    Double getPrice();

    LocalDateTime getPurchaseTime();

}
