package com.haui.nguyenanhtu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haui.nguyenanhtu.entity.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
