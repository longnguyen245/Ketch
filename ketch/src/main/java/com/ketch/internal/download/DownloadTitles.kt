package com.ketch.internal.download

import kotlinx.serialization.Serializable

@Serializable
data class DownloadTitles(
    var startTitle: String? = null,
    var progressTitle: String? = null,
    val failedTitle: String? = null,
    val successTitle: String? = null,
    val canceledTitle: String? = null,
    val pausedTitle: String? = null,
)