package com.example.gifsproject.repository;

import com.example.gifsproject.model.Member;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

@Repository
public interface MemberRepository extends CrudRepository <Member,Long>  {

    Collection<Member> findAll();

}
