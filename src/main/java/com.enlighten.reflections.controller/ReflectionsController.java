package com.enlighten.reflections.controller;

import com.enlighten.reflections.repository.*;
import com.enlighten.reflections.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reflections")
public class ReflectionsController {
  @Autowired
  private ReflectionsRepository repository;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Reflection> getAllListings() {
      return repository.findAll();
  }
}