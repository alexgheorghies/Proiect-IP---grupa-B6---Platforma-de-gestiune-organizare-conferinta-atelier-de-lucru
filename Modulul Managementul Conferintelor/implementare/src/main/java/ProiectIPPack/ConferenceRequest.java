package ProiectIPPack;

import ProiectIPPack.internal.ConferencePack.Conference;
import ProiectIPPack.internal.ConferencePack.Conference;
import ProiectIPPack.internal.ConferencePack.ConferenceUpload;
import ProiectIPPack.internal.ConferencePack.UploadInfo;
import org.xwiki.component.annotation.Role;

@Role
public interface ConferenceRequest
{
    Conference getConferenceInstance();
    UploadInfo getUploadInfoInstance();
    ConferenceUpload getConferenceUploadInstance();
}
