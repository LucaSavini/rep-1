package com.example.Rep1.Repository;

import com.example.Rep1.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface Repo extends JpaRepository<Car, Long> {
}
