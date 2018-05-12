
package GPartPack.script;

import GPartPack.UserRequest;
import org.xwiki.component.annotation.Component;
import org.xwiki.script.service.ScriptService;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Component
@Named("userrequest")
@Singleton
public class UserScriptService implements ScriptService
{
    @Inject
    private UserRequest userReq;

    public String farewell() {
        return this.userReq.sayGoodBye() + " user";
    }
}
