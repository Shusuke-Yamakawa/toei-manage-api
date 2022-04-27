package com.toei.manage.log

import com.toei.manage.log.RequestLoggingFilter
import lombok.extern.slf4j.Slf4j
import org.springframework.web.filter.AbstractRequestLoggingFilter
import javax.servlet.http.HttpServletRequest

@Slf4j
class RequestLoggingFilter : AbstractRequestLoggingFilter() {
    override fun beforeRequest(request: HttpServletRequest, message: String) {
        // log.info(message)
        request.setAttribute(BEFORE_REQUEST_MILLI_SEC_KEY, System.currentTimeMillis())
    }

    override fun afterRequest(request: HttpServletRequest, message: String) {
        val beforeMilliTime = request.getAttribute(BEFORE_REQUEST_MILLI_SEC_KEY)
        if (beforeMilliTime is Long) {
            val elapsedMilliTime = System.currentTimeMillis() - beforeMilliTime
            // log.info("処理時間 {}ms {}", elapsedMilliTime, message)
        } else {
            // log.info(message)
        }
    }

    companion object {
        private val BEFORE_REQUEST_MILLI_SEC_KEY = RequestLoggingFilter::class.java.name
    }
}