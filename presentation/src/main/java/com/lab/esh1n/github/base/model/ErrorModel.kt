package com.lab.esh1n.github.base.model

/**
 * Created by esh1n on 3/15/18.
 */

class ErrorModel private constructor(val message: String, val kind: Kind, val code: Int) {

    enum class Kind {
        HTTP, CONNECTION, DATABASE, UNEXPECTED
    }

    companion object {
        val CODE_UNDEFINED = -1

        fun httpError(message: String, code: Int): ErrorModel {
            return ErrorModel(message, Kind.HTTP, code)
        }

        fun connectionError(message: String): ErrorModel {
            return ErrorModel(message, Kind.CONNECTION, CODE_UNDEFINED)
        }

        fun databaseError(message: String): ErrorModel {
            return ErrorModel(message, Kind.DATABASE, CODE_UNDEFINED)
        }

        fun unexpectedError(message: String): ErrorModel {
            return ErrorModel(message, Kind.UNEXPECTED, CODE_UNDEFINED)
        }
    }
}