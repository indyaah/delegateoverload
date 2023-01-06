package pro.anuj.delegateoverload.impl.type;

import pro.anuj.delegateoverload.Type;
import org.springframework.stereotype.Component;

@Component
public class V2Type implements Type {
    public Integer val() {
        return 2;
    }
}
