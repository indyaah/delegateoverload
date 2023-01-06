package pro.anuj.delegateoverload.impl.batchtype;

import pro.anuj.delegateoverload.BatchType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BatchTypeDelegate implements BatchType {

    private final BatchType activeBatchType;

    public BatchTypeDelegate(@Value("${flag:false}") Boolean flag, V1BatchType v1BatchType, V2BatchType v2BatchType) {
        activeBatchType = flag ? v2BatchType : v1BatchType;
    }

    @Override
    public List<Integer> batchVal() {
        return activeBatchType.batchVal();
    }

    @Override
    public Integer val() {
        return activeBatchType.val();
    }
}
