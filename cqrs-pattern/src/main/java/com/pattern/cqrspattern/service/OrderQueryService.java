package com.pattern.cqrspattern.service;

import com.pattern.cqrspattern.dto.PurchaseOrderSummaryDto;

import java.util.List;

public interface OrderQueryService {
    List<PurchaseOrderSummaryDto> getSaleSummaryGroupByState();
    PurchaseOrderSummaryDto getSaleSummaryByState(String state);
    double getTotalSale();
}
