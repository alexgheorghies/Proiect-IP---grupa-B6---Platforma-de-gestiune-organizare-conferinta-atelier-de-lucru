
package GPartPack.script;

import GPartPack.PresentationRequest;
import GPartPack.internal.PresentationPack.Author;
import GPartPack.internal.PresentationPack.Presentation;
import GPartPack.internal.PresentationPack.PresentationUpload;
import GPartPack.internal.PresentationPack.UploadInfo;
import org.xwiki.component.annotation.Component;
import org.xwiki.script.service.ScriptService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
@Component
@Named("presrequest")
@Singleton
public class PresentationScriptService implements ScriptService {



    @Inject
    private PresentationRequest presReq;

    public String greet() {
        return this.presReq.sayHello() + " user";
    }

    public String uploadWork(PresentationUpload presentationUpload) throws Exception {

        return presentationUpload.toString();
    }

    public Author getAuthorInstance(){
        return presReq.getAuthorInstance();
    }

    public Presentation getPresentationInstance(){
        return presReq.getPresentationInstance();
    }

    public UploadInfo getUploadInfoInstance(){
        return presReq.getUploadInfoInstance();
    }

    public PresentationUpload getPresentationUploadInstance(){
        return presReq.getPresentationUploadInstance();
    }
}
