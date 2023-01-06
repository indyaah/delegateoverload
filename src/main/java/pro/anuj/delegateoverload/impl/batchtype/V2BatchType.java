package pro.anuj.delegateoverload.impl.batchtype;

import pro.anuj.delegateoverload.BatchType;
import pro.anuj.delegateoverload.impl.type.V2Type;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class V2BatchType implements BatchType {

    private final V2Type v2Type;

    public V2BatchType(V2Type v2Type) {
        this.v2Type = v2Type;
    }

    public List<Integer> batchVal() {
        return List.of(1, 2);
    }

    @Override
    public Integer val() {
        return v2Type.val();
    }
}
