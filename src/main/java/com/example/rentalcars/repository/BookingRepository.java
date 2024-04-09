package com.example.rentalcars.repository;

import com.example.rentalcars.model.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<BookingEntity, Long> {


    List<BookingEntity> findBookingsByOfferUuidAndPickUpDateTimeLessThanEqualAndDropOffDateTimeGreaterThanEqual(UUID id, LocalDateTime start, LocalDateTime end);

}
