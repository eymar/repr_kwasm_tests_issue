package abc.tests

import kotlinx.coroutines.test.runTest
import kotlin.test.Test

class Testt {

    @Test
    fun test() = runTest {
        throwsJsException()
    }

    @Test
    fun notAsyncTest() {
        throwsJsException()
    }
}

fun throwsJsException(): JsAny  = js("callUnknownFunction()")