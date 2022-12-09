package com.example.cheri2.web.controller.Home;

import com.example.cheri2.data.domain.Admin_Home.Home;
import com.example.cheri2.service.home.HomeService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/home")
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request. please follow API documentation for proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints thine request cannot be authorised"),
        @io.swagger.annotations.ApiResponse(code = 501, message = "Man down, please bear with us as we work to restore the server")
})
public class HomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("/{Id}")
    public ResponseEntity<Home> getHomeById(@PathVariable("Id") Long Id){
        Optional<Home> foundHome = homeService.getHomeById(Id);
        return new ResponseEntity<>(foundHome.get(), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<Home> createHome(@RequestBody Home reqHome) {
        Home newHome = homeService.createHome(reqHome);
        return new ResponseEntity<>(newHome, HttpStatus.CREATED);
    }

}
