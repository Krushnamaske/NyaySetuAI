package com.nyaysetu.ai.presentation

import android.net.Uri
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object ShareBus {

    private val _events =
        MutableStateFlow<Pair<String?, List<Uri>>?>(null)

    val events: StateFlow<Pair<String?, List<Uri>>?> =
        _events

    fun publish(
        text: String?,
        uris: List<Uri>
    ) {
        _events.value = text to uris
    }

    fun clear() {
        _events.value = null
    }
}