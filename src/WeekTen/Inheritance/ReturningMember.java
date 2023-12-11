package WeekTen.Inheritance;

// Subclass ReturningMember extending Member
class ReturningMember extends Member {
    private String membershipRenewalDate;

    public ReturningMember(String name, String contactInfo, String membershipPlan, String membershipRenewalDate) {
        super(name, contactInfo, membershipPlan);
        this.membershipRenewalDate = membershipRenewalDate;
    }

    // Getter and Setter for new instance variable
    public String getMembershipRenewalDate() {
        return membershipRenewalDate;
    }

    public void setMembershipRenewalDate(String membershipRenewalDate) {
        this.membershipRenewalDate = membershipRenewalDate;
    }

    // Override toString() method to include new instance variable
    @Override
    public String toString() {
        return super.toString() + ", Membership Renewal Date: " + membershipRenewalDate;
    }
}
