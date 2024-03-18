package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.User;
import com.ecommerce.entity.UserRole;
import com.ecommerce.repositry.UserRepository;
import com.ecommerce.repositry.UserRoleRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
        	 System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");           
        };
        
        //System.out.println("user="+user.getUsername() + " password=" +user.getPassword() + " user.isEnabled()="+user.isEnabled());
        
        List<UserRole> userRoles = userRoleRepository.findByUserId(user.getId());
        //System.out.println(userRoles.size());
        
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(userRoles.stream().map(UserRole::getRole).toArray(String[]::new))
                .disabled(!user.isEnabled())
                .build();
    }
}

