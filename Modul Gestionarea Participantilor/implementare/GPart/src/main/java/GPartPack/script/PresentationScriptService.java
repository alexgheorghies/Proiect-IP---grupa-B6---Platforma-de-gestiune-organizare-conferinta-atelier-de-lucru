
package GPartPack.script;

import GPartPack.PresentationRequest;
import GPartPack.Uploader;
import org.xwiki.component.annotation.Component;
import org.xwiki.script.service.ScriptService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
@Component
@Named("presrequest")
@Singleton
public class PresentationScriptService implements ScriptService
{



    @Inject
    private PresentationRequest presReq;

    public String greet() {
        return this.presReq.sayHello() + " user";
    }

    public String uploadWork(String user, String mail) throws Exception {

        Uploader uploader=new Uploader();
        uploader.uploadPresentation();
        return null;
    }
}
