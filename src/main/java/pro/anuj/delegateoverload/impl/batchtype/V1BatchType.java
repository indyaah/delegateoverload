package pro.anuj.delegateoverload.impl.batchtype;

import pro.anuj.delegateoverload.BatchType;
import pro.anuj.delegateoverload.impl.type.V1Type;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class V1BatchType implements BatchType {

    private final V1Type v1Type;

    public V1BatchType(V1Type v1Type) {
        this.v1Type = v1Type;
    }

    public List<Integer> batchVal() {
        return List.of(1);
    }

    @Override
    public Integer val() {
        return v1Type.val();
    }
}
