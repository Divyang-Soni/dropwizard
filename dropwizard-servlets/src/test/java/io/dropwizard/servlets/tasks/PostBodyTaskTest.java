package io.dropwizard.servlets.tasks;

import org.junit.Test;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class PostBodyTaskTest {
    private final PostBodyTask task = new PostBodyTask("test") {
        @Override
        public void execute(Map<String, List<String>> parameters, String body, PrintWriter output) throws Exception {

        }
    };

    @SuppressWarnings("deprecation")
    @Test
    public void throwsExceptionWhenCallingExecuteWithoutThePostBody() throws Exception {
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() ->
                task.execute(Collections.emptyMap(), new PrintWriter(System.out)));
    }
}
