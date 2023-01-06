package pro.anuj.delegateoverload.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pro.anuj.delegateoverload.BatchType;
import pro.anuj.delegateoverload.Type;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = Context.class, properties = "flag=true")
class ContextTest {

    @Autowired
    Type type;

    @Test
    public void test() {
        assertThat(type).isNotNull();
        assertThat(type.val()).isEqualTo(2);
        assertThat(type).isNotInstanceOf(BatchType.class);
    }
}