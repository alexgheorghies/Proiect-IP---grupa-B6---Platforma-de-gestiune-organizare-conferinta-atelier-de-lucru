
package GPartPack;

import GPartPack.internal.PresentationPack.Author;
import GPartPack.internal.PresentationPack.Presentation;
import GPartPack.internal.PresentationPack.PresentationUpload;
import GPartPack.internal.PresentationPack.UploadInfo;
import org.xwiki.component.annotation.Role;

@Role
public interface PresentationRequest {
    String sayHello();

    Author getAuthorInstance();
    Presentation getPresentationInstance();
    UploadInfo getUploadInfoInstance();
    PresentationUpload getPresentationUploadInstance();
}

