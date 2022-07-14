package com.nttdata.BC21.PersonClient.repository;

import com.nttdata.BC21.PersonClient.model.PersonClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonClientRepository extends ReactiveMongoRepository<PersonClient, String> {
}
