package ProiectIPPack.script;

import ProiectIPPack.ConferenceRequest;
import org.xwiki.script.service.ScriptService;
import org.xwiki.component.annotation.Component;
import javax.jnlp.ServiceManager;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Component
@Named("testIP")
@Singleton
public class ConferenceScriptService implements ScriptService
{
    @Inject
    private ConferenceRequest confReq;

    public String greet()
    {
        String ceva = "fadsfas";
        return ceva;
    }
}
