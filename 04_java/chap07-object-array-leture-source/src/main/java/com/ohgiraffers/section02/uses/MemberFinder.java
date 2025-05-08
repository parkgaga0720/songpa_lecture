package com.ohgiraffers.section02.uses;

public class MemberFinder {
    public Member[] finAlldMembers() {
        return MemberRepository.findAllMembers();
    }
}
