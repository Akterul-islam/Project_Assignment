package com.in.rs.Service;

import com.in.rs.Model.Dto.UserDto;
import com.in.rs.Model.Dto.UserTypeDto;
import com.in.rs.Model.Entity.User;
import com.in.rs.Model.Entity.UserType;
import com.in.rs.Repository.UserRepository;
import com.in.rs.Repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserTypeRepository userTypeRepository;

    @Transactional
    public User createNewUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setMobileNo(userDto.getMobileNo());
        user.setEmail(userDto.getEmail());
        user.setReligion(userDto.getReligion());
        user.setPresentUnion(userDto.getUnion());
        user.setDistrict(userDto.getDistrict());
        user.setPostOffice(userDto.getPostOffice());
        user.setPoliceStation(userDto.getPoliceStation());
        Optional<UserType> userTypeOptional = userTypeRepository.findById(userDto.getUserTypeId());
        UserType userType = userTypeOptional.get();
        user.setUserType(userType);
        return userRepository.save(user);
    }

    @Transactional
    public void createUserRole(UserTypeDto userTypeDto) {
        UserType userType = new UserType();
        userType.setName(userTypeDto.getName());
        userTypeRepository.save(userType);
    }
}
