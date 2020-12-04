package com.example.socialapp

class Utils {

    companion object {
        private const val SECOND_MILLIS = 1000
        private const val MINUTE_MILLIS = 60 * SECOND_MILLIS
        private const val HOUR_MILLIS = 60 * MINUTE_MILLIS
        private const val DAY_MILLIS = 24 * HOUR_MILLIS

        fun getTimeAgo(time: Long): String? {
            val now: Long = System.currentTimeMillis()

            if (time > now || time <= 0)
                return null

            val diff = now - time

            return if (diff < MINUTE_MILLIS)
                "Just Now"
            else if (diff < 2 * MINUTE_MILLIS)
                "A Minute Ago"
            else if (diff < HOUR_MILLIS)
                (diff / MINUTE_MILLIS).toString() + " Minutes Ago"
            else if (diff < 2 * HOUR_MILLIS)
                "An Hour Ago"
            else if (diff < DAY_MILLIS)
                (diff / HOUR_MILLIS).toString() + " Hours Ago"
            else if (diff < 2 * DAY_MILLIS)
                "Yesterday"
            else
                (diff / DAY_MILLIS).toString() + " Days Ago"
        }
    }
}