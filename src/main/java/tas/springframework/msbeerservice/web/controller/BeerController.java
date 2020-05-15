package tas.springframework.msbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tas.springframework.msbeerservice.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    private ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        // TODO
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        // TODO
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    private ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        // TODO
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
