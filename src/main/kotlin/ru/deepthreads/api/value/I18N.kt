package ru.deepthreads.api.value

object I18N {
    const val INCORRECT_NICKNAME_FORMAT = "Nickname must consist of numbers and Latin letters and have a length of at least 5"
    const val INCORRECT_DEEP_ID_FORMAT = "Deep ID must consist of numbers and Latin letters and have a length of at least 5"
    const val INCORRECT_PASSWORD_FORMAT = "The password must consist of numbers and Latin letters and have a length of at least 6"
    const val NONEXISTENT_ACCOUNT = "The account does not exist. It may have been deleted or you entered the wrong Deep ID"
    const val TAKEN_DEEP_ID = "The Deep ID you entered is already being used by another user"
    const val WRONG_PASSWORD = "Wrong password"
    const val INVALID_TOKEN = "Invalid authorization token. Please re-login to your account"
    const val EMPTY_TOKEN = "Empty authorization token. Please re-login to your account"
    const val NOT_FOUND = "The data you requested does not exist or has been deleted"
    const val EMPTY_NICKNAME = "Nickname cannot be empty"
    const val CANNOT_EDIT_DEEP_ID = "The Deep ID has already been changed, you cannot change it yourself for the second time"
    const val EMPTY_AVATAR = "The avatar value cannot be empty"
    const val ALREADY_SUBSCRIBED = "You are already subscribed to this user"
    const val NOT_SUBSCRIBED = "You are not subscribed to this user"
    const val INTERNAL_SERVER_ERROR = "An internal error has occurred on the server, which makes it impossible to process your request. If this happens again, let the developers know."
}
