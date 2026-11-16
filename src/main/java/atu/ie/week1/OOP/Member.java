package atu.ie.week1.OOP;

public class Member {
    private String memberID;
    private String memberName;
    private int memberAge;

    public Member(String memberID, String memberName, int memberAge) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    public String getMemberID() {
        return memberID;
    }
    public String getMemberName() {
        return memberName;
    }
    public int getMemberAge() {
        return memberAge;
    }
    public void display() {
        System.out.println("Member ID " + memberID);
        System.out.println("Member Name "+ memberName);
        System.out.println("Member Age "+ memberAge);
    }
}
