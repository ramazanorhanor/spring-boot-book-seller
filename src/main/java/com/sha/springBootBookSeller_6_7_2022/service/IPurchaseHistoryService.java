package com.sha.springBootBookSeller_6_7_2022.service;

import com.sha.springBootBookSeller_6_7_2022.model.PurchaseHistory;
import com.sha.springBootBookSeller_6_7_2022.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
