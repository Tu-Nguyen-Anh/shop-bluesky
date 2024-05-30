
package com.haui.nguyenanhtu.controller;

import java.util.List;

import com.haui.nguyenanhtu.entity.OrderDetail;
import com.haui.nguyenanhtu.repository.OrderDetailRepository;
import com.haui.nguyenanhtu.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("api/orderDetail")
public class OderDetailController {

	@Autowired
	OrderDetailRepository orderDetailRepository;

	@Autowired
	OrderRepository orderRepository;
	// Lấy ra thông tin chi tiết đơn hàng đã đặt theo id đơn hàng
	@GetMapping("/order/{id}")
	public ResponseEntity<List<OrderDetail>> getByOrder(@PathVariable("id") Long id) {
		if (!orderRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(orderDetailRepository.findByOrder(orderRepository.findById(id).get()));
	}

}
