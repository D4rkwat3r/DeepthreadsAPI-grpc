package ru.deepthreads.api.service

import ru.deepthreads.api.grpc.MediaServiceGrpcKt
import ru.deepthreads.api.grpc.MediaServiceOuterClass

class MediaService : MediaServiceGrpcKt.MediaServiceCoroutineImplBase() {
    override suspend fun uploadMedia(request: MediaServiceOuterClass.UploadMediaRequest): MediaServiceOuterClass.MediaResponse {
        return super.uploadMedia(request)
    }

    override suspend fun getMediaById(request: MediaServiceOuterClass.MediaIdRequest): MediaServiceOuterClass.MediaResponse {
        return super.getMediaById(request)
    }

    override suspend fun getMediaByPath(request: MediaServiceOuterClass.MediaPathRequest): MediaServiceOuterClass.MediaResponse {
        return super.getMediaByPath(request)
    }
}
