package service;

import entity.JobPosition;

import java.util.ArrayList;
import java.util.Scanner;

public class JobPositionService {
    public void inputJobPosition(){
        System.out.println("Moi ban nhap so luong vi tri cong viec muon luu : ");
        int numberJob = new Scanner(System.in).nextInt();
        ArrayList<JobPosition> jobPositions = new ArrayList<JobPosition>();

        for (int i = 0; i <numberJob; i++) {

            System.out.println("Moi ban nhap thong tin cong viec thu "+(i+1));
            JobPosition jobPosition = new JobPosition();
            System.out.println("Moi ban nhap ten cong viec");
            jobPosition.setNameJob(new Scanner(System.in).nextLine());
            System.out.println("Moi ban nhap muc thuong : ");
            jobPosition.setBonus(new Scanner(System.in).nextDouble());
            jobPositions.add(jobPosition);
        }

            System.out.println(jobPositions);
    }
}
