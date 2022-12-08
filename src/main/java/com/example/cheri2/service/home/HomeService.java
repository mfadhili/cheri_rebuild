package com.example.cheri2.service.home;

import com.example.cheri2.data.domain.Admin_Home.Home;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface HomeService {
    Home createHome( Home home);
    void deleteHome( Long homeId);
    Optional<Home> getHomeById(Long Id);

}
