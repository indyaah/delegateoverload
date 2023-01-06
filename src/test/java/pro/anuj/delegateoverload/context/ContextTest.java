package pro.anuj.delegateoverload.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pro.anuj.delegateoverload.Type;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = Context.class)
class ContextTest {

    @Autowired
    Type type;

    @Test
    public void test() {
        assertThat(type).isNotNull();
        assertThat(type.val()).isEqualTo(1);
        assertThat(type.val()).isEqualTo(1);
    }
}