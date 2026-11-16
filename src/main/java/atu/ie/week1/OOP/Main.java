package atu.ie.week1.OOP;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter member ID");
        String memberID=scanner.nextLine();
        System.out.println("enter member Name");
        String memberName=scanner.nextLine();
        System.out.println("enter member Age");
        int memberAge=scanner.nextInt();

        Member member=new Member(memberID, memberName, memberAge);
        System.out.println("Member created successfully");
        member.displayDetails();

        scanner.close();
    }
}