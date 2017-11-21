package com.example.gifsproject.Service;

import com.example.gifsproject.model.Member;
import com.example.gifsproject.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class MemberService {

    private static final Logger LOG = LoggerFactory.getLogger(MemberService.class);

    MemberRepository memberRepository;

    String answers;


    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;

    }

    public Collection<Member> getMembers() {
        return memberRepository.findAll();
    }

    public Member getMember(Long id){
        return memberRepository.findOne(id);
    }

    public void addMember(Member member) {
        memberRepository.save(member);//adding rows to book table
    }

    public void removeMember(Long id) {
        memberRepository.delete(id);
    }

    public void addAnswer(String nextAnswer){

    }
}
