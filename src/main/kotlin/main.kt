import com.google.rpc.Status
import io.grpc.StatusRuntimeException
import io.grpc.protobuf.StatusProto
import ru.deepthreads.api.ApiServer
import ru.deepthreads.api.grpc.apiException
import ru.deepthreads.api.value.ApiCode
import com.google.protobuf.Any.pack as PackAny
import java.time.Instant

fun createApiStatus(code: ApiCode, message: String): Status {
    val status = Status.newBuilder().setCode(code.grpc)
        .setMessage(message)
        .addDetails(
            PackAny(
                apiException {
                    apiCode = code.ordinal
                    apiMessage = message
                }
            )
        ).build()
    return status
}

fun createApiException(code: ApiCode, message: String): StatusRuntimeException {
    return StatusProto.toStatusRuntimeException(createApiStatus(code, message))
}

fun throwApiException(code: ApiCode, message: String) {
    throw createApiException(code, message)
}

fun millis() = System.currentTimeMillis()
fun seconds() = Instant.now().epochSecond
fun nano() = System.nanoTime()

fun main(args: Array<String>) {
    val port = args.getOrNull(0)
        ?.toIntOrNull()
        ?: return println("Usage: java -jar server.jar [port]")
    ApiServer(port).start()
}
