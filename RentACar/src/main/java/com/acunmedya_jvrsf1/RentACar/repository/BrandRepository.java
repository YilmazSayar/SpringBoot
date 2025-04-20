package com.acunmedya_jvrsf1.RentACar.repository;

import com.acunmedya_jvrsf1.RentACar.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
