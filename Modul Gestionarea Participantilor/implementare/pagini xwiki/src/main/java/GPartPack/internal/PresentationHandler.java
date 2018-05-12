
package GPartPack.internal;

import GPartPack.PresentationRequest;
import org.xwiki.component.annotation.Component;

import javax.inject.Singleton;


@Component
@Singleton
public class PresentationHandler implements PresentationRequest  {
    private String test = "test";

    @Override
    public String sayHello() {
        return "Hello " + test;
    }
}

