package fr.hippo.nbastats.config;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestTemplateConfigurationUnitTest {

    @Test
    public void shouldGetRestTemplate() {
        assertThat(new RestTemplateConfiguration().restTemplate()).isNotNull();
    }
}
