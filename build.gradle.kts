plugins {
	autowire(libs.plugins.android.application) apply false
	autowire(libs.plugins.kotlin.android) apply false
	autowire(libs.plugins.kotlin.ksp) apply false
	autowire(libs.plugins.android.x.room) apply false
}