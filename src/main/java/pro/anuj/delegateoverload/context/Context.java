package pro.anuj.delegateoverload.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import pro.anuj.delegateoverload.Type;
import pro.anuj.delegateoverload.impl.batchtype.BatchTypeDelegate;
import pro.anuj.delegateoverload.impl.type.TypeDelegate;

import java.util.Optional;

@ComponentScan(basePackages = {"pro.anuj.delegateoverload.impl.type"})
public class Context {

    @Bean
    @Primary
    public Type type(Optional<TypeDelegate> typeDelegate, Optional<BatchTypeDelegate> batchTypeDelegate) {
        if (batchTypeDelegate.isPresent()) {
            return batchTypeDelegate.get();
        } else if (typeDelegate.isPresent()) {
            return typeDelegate.get();
        }
        return null;
    }

}
