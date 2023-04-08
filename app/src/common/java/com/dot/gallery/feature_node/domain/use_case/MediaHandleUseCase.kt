package com.dot.gallery.feature_node.domain.use_case

import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import com.dot.gallery.feature_node.domain.model.Media
import com.dot.gallery.feature_node.domain.repository.MediaRepository
import javax.inject.Inject

class MediaHandleUseCase @Inject constructor(
    private val repository: MediaRepository
) {
    suspend fun toggleFavorite(media: Media): Int = repository.toggleFavorite(media)

    suspend fun toggleFavorite(mediaList: List<Media>) = repository.toggleFavorite(mediaList)

    suspend fun trashMedia(
        result: ActivityResultLauncher<IntentSenderRequest>,
        mediaList: List<Media>,
        trash: Boolean = true
    ) = repository.trashMedia(result, mediaList, trash)

    suspend fun deleteMedia(
        result: ActivityResultLauncher<IntentSenderRequest>,
        mediaList: List<Media>
    ) = repository.deleteMedia(result, mediaList)
}