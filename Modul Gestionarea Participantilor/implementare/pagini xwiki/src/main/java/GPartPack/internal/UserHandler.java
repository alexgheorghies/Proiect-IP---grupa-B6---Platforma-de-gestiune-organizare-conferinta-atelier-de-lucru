
package GPartPack.internal;

import GPartPack.UserRequest;
import org.xwiki.component.annotation.Component;

import javax.inject.Singleton;


@Component
@Singleton
public class UserHandler implements UserRequest {
    private String test = "test";

    @Override
    public String sayGoodBye() {
        return "Goodbye " + test;
    }
}

