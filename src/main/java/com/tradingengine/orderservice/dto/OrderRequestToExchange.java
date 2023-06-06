package com.tradingengine.orderservice.dto;

import com.tradingengine.orderservice.enums.OrderSide;
import com.tradingengine.orderservice.enums.OrderType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class OrderRequestToExchange {

    @NotNull
    private String product;
    @NotNull
    @Min(value = 1)
    private Integer quantity;
    @NotNull
    private Double price;
    @NotNull
    private OrderSide orderSide;
    @NotNull
    private OrderType type;


}

