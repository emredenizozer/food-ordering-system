package com.food.ordering.system.domain.entity;

import java.util.Objects;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> {
    private ID id;
}
