package ProiectIPPack.internal.ConferencePack;

public class ConferenceUpload
{
    private Conference conference;
    private UploadInfo uploadInfo;

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public UploadInfo getUploadInfo() {
        return uploadInfo;
    }

    public void setUploadInfo(UploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
    }

    @Override
    public String toString() {
        return "ConferenceUpload{" +
                "conference=" + conference +
                ", uploadInfo=" + uploadInfo +
                '}';
    }
}
