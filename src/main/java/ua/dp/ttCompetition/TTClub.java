package ua.dp.ttCompetition;

import java.util.Objects;

public class TTClub {

    private Long id;
    private String clubName;
    private String address;
    private String telNumber;
    private String definition;
    private User managerName;

    public TTClub() {

    }

    public TTClub(String clubName) {
        this.clubName = clubName;
    }

    public TTClub(String clubName, String address, String telNumber, User managerName) {
        this.clubName = clubName;
        this.address = address;
        this.telNumber = telNumber;
        this.managerName = managerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public User getManagerName() {
        return managerName;
    }

    public void setManagerName(User managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "TTClub{" +
                "clubName='" + clubName + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", managerName=" + managerName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTClub ttClub = (TTClub) o;
        return Objects.equals(id, ttClub.id) &&
                Objects.equals(clubName, ttClub.clubName) &&
                Objects.equals(address, ttClub.address) &&
                Objects.equals(telNumber, ttClub.telNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clubName, address, telNumber);
    }
}
