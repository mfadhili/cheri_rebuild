package com.example.cheri2.service.home;

import com.example.cheri2.data.domain.Admin_Home.Home;
import com.example.cheri2.data.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public Home createHome(Home home) {
        return null;
    }

    @Override
    public void deleteHome(Long homeId) {

    }

    @Override
    public Optional<Home> getHomeById(Long Id) {
        Optional<Home> home = homeRepository.getHomeById(Id);

        if (home.isPresent()) {
            return home;
        }
        else {
            throw new IllegalStateException("Home of Id "+ Id + "Does not exist");
        }

    }
}
