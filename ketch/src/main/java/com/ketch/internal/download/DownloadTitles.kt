package com.ketch.internal.download

import kotlinx.serialization.Serializable

@Serializable
data class DownloadTitles(
    var progressTitle: String? = null,
    val failedTitle: String? = null,
    val successTitle: String? = null,
    val canceledTitle: String? = null,
    val pausedTitle: String? = null,
)

@Serializable
data class DownloadContentTexts(
    var progressContentText: String? = null,
    val failedContentText: String? = null,
    val successContentText: String? = null,
    val canceledContentText: String? = null,
    val pausedContentText: String? = null,
)