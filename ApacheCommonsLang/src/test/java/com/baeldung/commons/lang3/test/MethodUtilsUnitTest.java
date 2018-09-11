package com.baeldung.commons.lang3.test;

import com.baeldung.commons.lang3.beans.User;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.lang3.reflect.MethodUtils;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class MethodUtilsUnitTest {

    @Test
    public void givenMethodUtilsClass_whenCalledgetAccessibleMethod_thenCorrect() {
        assertThat(MethodUtils.getAccessibleMethod(User.class, "getName")).isInstanceOf(Method.class);
    }

    @Test
    public void givenMethodUtilsClass_whenCalledinvokeExactMethod_thenCorrect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        assertThat(MethodUtils.invokeExactMethod(new User("John", "john@domain.com"), "getName")).isEqualTo("John");
    }

    @Test
    public void givenMethodUtilsClass_whenCalledinvokeMethod_thenCorrect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        User user = new User("John", "john@domain.com");
        Object method = MethodUtils.invokeMethod(user, true, "setName", "John");
        assertThat(user.getName()).isEqualTo("John");
    }
}
