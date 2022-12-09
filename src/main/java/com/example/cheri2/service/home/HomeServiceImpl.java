package com.example.cheri2.service.home;

import com.example.cheri2.data.domain.Admin_Home.Home;
import com.example.cheri2.data.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public Home createHome(Home home) {
        Home newHome = new Home();

        newHome.setHome_name(home.getHome_name());
        newHome.setHome_email(home.getHome_email());
        newHome.setTelephone(home.getTelephone());
        newHome.setCreatedAt(LocalDate.now());

        return homeRepository.save(newHome);
    }

    @Override
    public String deleteHome(Long homeId) {
        boolean exist = homeRepository.existsById(homeId);

        if (!exist){
            throw new IllegalStateException("Home of Id "+ homeId + "Does not exist");
        }
        else
            homeRepository.deleteById(homeId);

        return "deleted successful";
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
