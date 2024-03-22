package view;

import entity.AssignmentTable;
import entity.Member;
import service.AssignMentTableManagementService;
import service.JobPositionService;
import service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void diplayMenu(){
        while (true) {
            System.out.println("=========== Phan mem quan ly phan chia tien thuong ===========");
            System.out.println("Moi ban chon chuc nang : ");
            System.out.println("1 : Nhập danh sách thành viên. In ra danh sách thành viên đã có");
            System.out.println("2 : Nhập danh sách vị trí công việc. In ra danh sách vị trí đã có");
            System.out.println("3 : Nhập danh sách phân công công việc cho mỗi thành viên đã có và in danh sách ra màn hình.");
            System.out.println("4 : Sap xep danh sach phan cong theo ho ten thanh vien");
            System.out.println("5 : Sap xep danh sach phan cong theo so ngay lam giam dan");
            System.out.println("6 : Tính tổng tiền thưởng của các thành viên và in ra màn hình (tổng tiền thưởng bằng tiền thưởng theo các vị trí đã làm + 10% mức lương hợp đồng)");
            int choice = new Scanner(System.in).nextInt();
            MemberService memberService = new MemberService();
            JobPositionService jobPositionService = new JobPositionService();
            AssignMentTableManagementService assignMentTableManagementService = new AssignMentTableManagementService();
            ArrayList<Member> members = new ArrayList<>();
            switch (choice) {
                case 1:
                    members = memberService.inputMember();
                    break;
                case 2:
                    jobPositionService.inputJobPosition();
                    break;
                case 3:
                    assignMentTableManagementService.creatAssignMentTable(members);
                    break;
                case 4:
                    memberService.findById(members);
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
            System.out.println("Do you want to continue");
            String choice1 = new Scanner(System.in).nextLine();
            if(choice1.equalsIgnoreCase("N")){
                System.out.println("Thoat chuong trinh");
                break;
            }
        }

    }
}

