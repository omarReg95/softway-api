package com.example.demo.controllers;

import com.example.demo.models.PathologieReponse;
import com.example.demo.services.PathologieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PathologieController {

    @Autowired
    private PathologieService pathologieService;

    /**
     * @param index
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<PathologieReponse> calculePathologie(@RequestParam Integer index) {
        return ResponseEntity.ok(pathologieService.calculePathologie(index));
    }
}
