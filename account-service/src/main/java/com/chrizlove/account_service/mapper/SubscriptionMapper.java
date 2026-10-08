package com.chrizlove.account_service.mapper;

import com.chrizlove.account_service.dto.subscription.SubscriptionResponse;
import com.chrizlove.account_service.entity.Plan;
import com.chrizlove.account_service.entity.Subscription;
import com.chrizlove.common_lib.dto.PlanDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanDto toPlanResponse(Plan plan);
}
