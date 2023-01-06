package pro.anuj.delegateoverload.impl.type;

import pro.anuj.delegateoverload.Type;
import org.springframework.stereotype.Component;

@Component
public class V1Type implements Type {
    public Integer val() {
        return 1;
    }
}
