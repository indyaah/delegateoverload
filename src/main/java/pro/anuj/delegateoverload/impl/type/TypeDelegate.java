package pro.anuj.delegateoverload.impl.type;

import org.springframework.stereotype.Component;
import pro.anuj.delegateoverload.Type;
import org.springframework.beans.factory.annotation.Value;

@Component
public class TypeDelegate implements Type {

    private final Type activeType;

    public TypeDelegate(@Value("${flag:false}") Boolean flag, V1Type v1Type, V2Type v2Type) {
        activeType = flag ? v2Type : v1Type;
    }

    @Override
    public Integer val() {
        return activeType.val();
    }
}
