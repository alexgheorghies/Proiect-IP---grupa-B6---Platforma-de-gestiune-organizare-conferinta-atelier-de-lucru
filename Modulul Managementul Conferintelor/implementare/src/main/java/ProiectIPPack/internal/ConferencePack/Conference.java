package ProiectIPPack.internal.ConferencePack;

public class Conference {
    String name;
    String nrOfParticipants;
    String organisator;
    String location;
    String conferenceDate;
    String numberOfPresentations;
    String listaSpeackeri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrOfParticipants() {
        return nrOfParticipants;
    }

    public void setNrOfParticipants(String nrOfParticipants) {
        this.nrOfParticipants = nrOfParticipants;
    }

    public String getOrganisator() {
        return organisator;
    }

    public void setOrganisator(String organisator) {
        this.organisator = organisator;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getConferenceDate() {
        return conferenceDate;
    }

    public void setConferenceDate(String conferenceDate) {
        this.conferenceDate = conferenceDate;
    }

    public String getNumberOfPresentations() {
        return numberOfPresentations;
    }

    public void setNumberOfPresentations(String numberOfPresentations) {
        this.numberOfPresentations = numberOfPresentations;
    }

    public String getListaSpeackeri() {
        return listaSpeackeri;
    }

    public void setListaSpeackeri(String listaSpeackeri) {
        this.listaSpeackeri = listaSpeackeri;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "name='" + name + '\'' +
                ", nrOfParticipants='" + nrOfParticipants + '\'' +
                ", organisator='" + organisator + '\'' +
                ", location='" + location + '\'' +
                ", conferenceDate='" + conferenceDate + '\'' +
                ", numberOfPresentations='" + numberOfPresentations + '\'' +
                ", listaSpeackeri='" + listaSpeackeri + '\'' +
                '}';
    }
}
