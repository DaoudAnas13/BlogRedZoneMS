package com.redzone.blog.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "STORE")
public interface ProductFeign {

    @GetMapping("/api/products")
    List<ProductFeignDTO> findAllProducts(Pageable pageable);


}
