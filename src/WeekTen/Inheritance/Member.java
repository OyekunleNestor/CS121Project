package WeekTen.Inheritance;

// Superclass Member
class Member {
    private String name;
    private String contactInfo;
    private String membershipPlan;

    public Member(String name, String contactInfo, String membershipPlan) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.membershipPlan = membershipPlan;
    }

    // Getters and Setters for instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(String membershipPlan) {
        this.membershipPlan = membershipPlan;
    }

    // toString() method to represent object as a String
    @Override
    public String toString() {
        return "Name: " + name + ", Contact Info: " + contactInfo + ", Membership Plan: " + membershipPlan;
    }
}
