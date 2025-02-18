package com.shopsphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
