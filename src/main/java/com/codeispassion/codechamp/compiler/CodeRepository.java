package com.codeispassion.codechamp.compiler;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CodeRepository extends MongoRepository<Code, String> {

}
