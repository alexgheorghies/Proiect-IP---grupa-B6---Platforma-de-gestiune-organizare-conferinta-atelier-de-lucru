package ProiectIPPack.internal;
import ProiectIPPack.ConferenceRequest;
import ProiectIPPack.internal.ConferencePack.Conference;
import ProiectIPPack.internal.ConferencePack.ConferenceUpload;
import ProiectIPPack.internal.ConferencePack.UploadInfo;
import org.xwiki.component.annotation.Component;
import javax.inject.Singleton;


@Component
@Singleton
public class ConferenceHandler implements ConferenceRequest
{
    public Conference getConferenceInstance()
    {
        return new Conference();
    }
    public UploadInfo getUploadInfoInstance()
    {
        return new UploadInfo();
    }
    public ConferenceUpload getConferenceUploadInstance()
    {
        return new ConferenceUpload();
    }
}
