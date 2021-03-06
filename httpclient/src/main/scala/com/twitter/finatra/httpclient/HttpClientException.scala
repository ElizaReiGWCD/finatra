package com.twitter.finatra.httpclient

import com.twitter.finagle.NoStacktrace
import com.twitter.finagle.httpx.Status

class HttpClientException(
  status: Status,
  msg: String)
  extends Exception(msg)
  with NoStacktrace
