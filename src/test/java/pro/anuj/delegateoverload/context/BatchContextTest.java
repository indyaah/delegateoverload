package pro.anuj.delegateoverload.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pro.anuj.delegateoverload.BatchType;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BatchContext.class)
class BatchContextTest {

    @Autowired
    BatchType type;

    @Test
    public void test() {
        assertThat(type).isNotNull();
        assertThat(type.val()).isEqualTo(1);
        assertThat(type.batchVal()).isEqualTo(List.of(1));
    }
}