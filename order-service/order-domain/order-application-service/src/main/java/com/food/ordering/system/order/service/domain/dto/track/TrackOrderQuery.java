package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.order.service.domain.dto.create.OrderAdress;
import com.food.ordering.system.order.service.domain.dto.create.OrderItem;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderQuery {
    @NotNull
    private final UUID orderTrackingId;
}
