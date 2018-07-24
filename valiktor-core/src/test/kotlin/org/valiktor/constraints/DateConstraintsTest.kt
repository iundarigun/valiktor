package org.valiktor.constraints

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.valiktor.i18n.SupportedLocales
import org.valiktor.i18n.interpolatedMessages
import kotlin.test.Test

class TodayTest {

    @Test
    fun `should validate messages`() {
        assertThat(Today.interpolatedMessages()).containsExactly(
                entry(SupportedLocales.DEFAULT, "Must be today"),
                entry(SupportedLocales.EN, "Must be today"),
                entry(SupportedLocales.PT_BR, "Deve ser hoje"))
    }
}