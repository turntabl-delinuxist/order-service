package com.tradingengine.orderservice.marketdata.service;

import com.tradingengine.orderservice.marketdata.models.Product;
import com.tradingengine.orderservice.marketdata.models.ProductInfo;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public interface MarketDataService {
    Stream<ProductInfo> getProductByTicker(String ticker) throws IOException;
    Stream<Product> findOrders(String product, String side) throws IOException;
    Stream<Product> findOrders(String product, String side, String orderType) throws IOException;
}
