package com.haui.nguyenanhtu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.haui.nguyenanhtu.entity.Image;
import com.haui.nguyenanhtu.entity.Product;

import java.util.List;

public interface ImageReposity extends JpaRepository<Image,Long> {
    List<Image> findByProduct(Product product);
}
