
package GPartPack.internal;

import GPartPack.PresentationRequest;
import GPartPack.internal.PresentationPack.Author;
import GPartPack.internal.PresentationPack.Presentation;
import GPartPack.internal.PresentationPack.PresentationUpload;
import GPartPack.internal.PresentationPack.UploadInfo;
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

    @Override
    public Author getAuthorInstance(){
        return new Author();
    }

    @Override
    public Presentation getPresentationInstance(){
        return new Presentation();
    }

    @Override
    public UploadInfo getUploadInfoInstance(){
        return new UploadInfo();
    }

    @Override
    public PresentationUpload getPresentationUploadInstance(){
        return new PresentationUpload();
    }
}

