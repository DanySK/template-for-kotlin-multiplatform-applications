package org.danilopianini

import kotlin.test.Test
import kotlin.test.assertNotEquals

/**
 * Dummy test to check that the test environment is working.
 */
class Test {
    @Test
    fun trueShouldNotBeFalse() {
        assertNotEquals(illegal = true, actual = false, message = "true should not be false")
    }
}
