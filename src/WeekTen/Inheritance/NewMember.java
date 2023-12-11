package WeekTen.Inheritance;

// Subclass NewMember extending Member
class NewMember extends Member {
    private String healthBackground;
    private String registrationDate;

    public NewMember(String name, String contactInfo, String membershipPlan, String healthBackground, String registrationDate) {
        super(name, contactInfo, membershipPlan);
        this.healthBackground = healthBackground;
        this.registrationDate = registrationDate;
    }

    // Getter and Setter for new instance variables
    public String getHealthBackground() {
        return healthBackground;
    }

    public void setHealthBackground(String healthBackground) {
        this.healthBackground = healthBackground;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Override toString() method to include new instance variables
    @Override
    public String toString() {
        return super.toString() + ", Health Background: " + healthBackground + ", Registration Date: " + registrationDate;
    }
}
