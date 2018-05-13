package GPartPack.internal.PresentationPack;

public class PresentationUpload {


    private Presentation presentation;
    private UploadInfo uploadInfo;

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public UploadInfo getUploadInfo() {
        return uploadInfo;
    }

    public void setUploadInfo(UploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
    }

    @Override
    public String toString() {
        return "PresentationUpload{" +
                "presentation=" + presentation +
                ", uploadInfo=" + uploadInfo +
                '}';
    }
}
