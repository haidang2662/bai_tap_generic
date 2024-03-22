package service;

import entity.Human;

import java.util.Scanner;

public class HumanService {
    public Human inputHuman(){
        Human human = new Human();
        System.out.println("Moi ban nhap ten : ");
        human.setName(new Scanner(System.in).nextLine());
        System.out.println("Moi ban nhap dia chi : ");
        human.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Moi ban nhap so dien thoai ");
        human.setTelephone(new Scanner(System.in).nextLine());
        return human;
    }
}
