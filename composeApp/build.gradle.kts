
plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {
//    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")
        }

    }
}

