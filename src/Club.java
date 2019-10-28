public class Club {
    private String clubName;
    private String address;
    private Member[] members;
    private int noOfMembers;
    private final int MAX_MEMBERS = 3;

    public Club(String clubName, String address) {
        this.clubName = clubName;
        this.address = address;
        this.members = new Member[3];
        this.noOfMembers = 0;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addMember(Member m){
        if (noOfMembers < MAX_MEMBERS){
            members[noOfMembers] = m;
            noOfMembers++;
        }

    }
}
