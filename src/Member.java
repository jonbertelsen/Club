public class Member {
    private String name;
    private int birthYear;
    private boolean activeMember;

    public Member(String name, int birthYear, boolean activeMember) {
        this.name = name;
        this.birthYear = birthYear;
        this.activeMember = activeMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isActiveMember() {
        return activeMember;
    }

    public void setActiveMember(boolean activeMember) {
        this.activeMember = activeMember;
    }

    // Before 1980: 100
    // 1980 - 2000: 200
    // After 2000: 300
    // Active members: add 150

    public int getFee(){
       int fee = 0;
       if (birthYear < 1980){
           fee = 100;
       } else if (birthYear > 2000){
           fee = 300;
       } else {
           fee = 200;
       }
       if (activeMember){
           fee = fee + 150;
       }
       return fee;
    }

}
