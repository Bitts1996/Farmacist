package com.example.Farmacist.Repository;

import com.example.Farmacist.models.Register;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GRegistrationRepository extends MongoRepository<Register,String> {
}
