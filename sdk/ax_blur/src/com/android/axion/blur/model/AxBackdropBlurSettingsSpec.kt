/*
 * Copyright (C) 2025-2026 AxionOS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.axion.blur.model

data class AxBackdropBlurSettingsSpec internal constructor(
    internal val enabledKey: String?,
    internal val radiusKey: String,
    internal val defaultEnabled: Boolean,
    internal val defaultRadiusPx: Float?,
    internal val maxRadiusPx: Float?,
) {
    companion object {
        private const val KEY_SYSTEM_BLUR_RADIUS = "system_blur_radius"
        private val SYSTEM = AxBackdropBlurSettingsSpec(
            enabledKey = null,
            radiusKey = KEY_SYSTEM_BLUR_RADIUS,
            defaultEnabled = true,
            defaultRadiusPx = null,
            maxRadiusPx = null,
        )

        @JvmStatic
        fun system(): AxBackdropBlurSettingsSpec {
            return SYSTEM
        }

        @JvmStatic
        fun secure(
            enabledKey: String,
            radiusKey: String,
            defaultEnabled: Boolean,
            defaultRadiusPx: Float,
            maxRadiusPx: Float,
        ): AxBackdropBlurSettingsSpec {
            return AxBackdropBlurSettingsSpec(
                enabledKey = enabledKey,
                radiusKey = radiusKey,
                defaultEnabled = defaultEnabled,
                defaultRadiusPx = defaultRadiusPx,
                maxRadiusPx = maxRadiusPx,
            )
        }
    }
}
