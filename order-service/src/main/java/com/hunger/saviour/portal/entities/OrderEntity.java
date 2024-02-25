package com.hunger.saviour.portal.entities;

import com.hunger.saviour.portal.services.UuidIdentifiedEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity extends UuidIdentifiedEntity {
//    @Id
//    private UUID orderId;
    private String username;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private OrderStatus orderStatus;// Scheduler every 2 mins
    private Double totalPrice;
    private String transactionId;// Kafka
    private String order_json;// Kafka


}
