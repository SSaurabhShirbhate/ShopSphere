package com.shopsphere.mapper;

import com.shopsphere.dto.OrderDto;
import com.shopsphere.dto.OrderItemDto;
import com.shopsphere.dto.UserDto;
import com.shopsphere.model.Order;
import com.shopsphere.model.OrderItem;
import com.shopsphere.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
