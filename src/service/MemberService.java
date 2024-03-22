package service;

import entity.Human;
import entity.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
    public ArrayList<Member> inputMember () {
        ArrayList<Member> members = new ArrayList<>();

        HumanService humanService = new HumanService();
        System.out.println("Moi ban nhap so luong thanh vien ma ban muon luu vao");
        int n = new Scanner(System.in).nextInt();
        Member member = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap thong tin thanh vien thu " + (i + 1));
            member = new Member();
            Human human = humanService.inputHuman();
            member.setHuman(human);
            System.out.println("Moi ban nhap luong");
            member.setWage(new Scanner(System.in).nextDouble());
            members.add(member);
        }
        System.out.println(members);
        return members;
    }
    public Member findById(ArrayList<Member> members){

        System.out.println("Moi ban nhap ma nhan vien : ");
        int idMember;
        Member member = null;
        while (true){
            idMember = new Scanner(System.in).nextInt();
            for (int j = 0; j < members.size(); j++) {
                if(members.get(j).getId()==idMember){
                    member = members.get(j);
                    break;
                }
            } if(member!=null){
                break;
            }
            System.out.println("Nhan vien khong ton tai");
        }
        return member;
    }
}
