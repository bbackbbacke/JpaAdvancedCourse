package com.sparta.redirect_outsourcing.exception.custom.restaurant;

import com.sparta.redirect_outsourcing.common.ResponseCodeEnum;

public class NotExistRestaurantCategoryException extends RestaurantException {
    public NotExistRestaurantCategoryException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum);

    }
}
