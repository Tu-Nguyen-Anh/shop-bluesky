
package com.haui.nguyenanhtu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haui.nguyenanhtu.entity.Favorite;
import com.haui.nguyenanhtu.entity.Product;
import com.haui.nguyenanhtu.entity.User;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

	// lay ra danh sach yeu thich boi nguoi dung
	List<Favorite> findByUser(User user);
	// đếm số sản phẩm
	Integer countByProduct(Product product);
	// tìm kiếm sản phẩm yêu thích  bởi người dùng và sản phẩm
	Favorite findByProductAndUser(Product product, User user);

}
