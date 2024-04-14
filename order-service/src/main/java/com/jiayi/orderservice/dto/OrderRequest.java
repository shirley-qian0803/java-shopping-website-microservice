package com.jiayi.orderservice.dto;

import com.jiayi.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
