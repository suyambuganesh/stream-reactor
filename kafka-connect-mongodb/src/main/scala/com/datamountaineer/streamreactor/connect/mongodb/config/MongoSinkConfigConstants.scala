/*
 * Copyright 2017 Datamountaineer.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datamountaineer.streamreactor.connect.mongodb.config

object MongoSinkConfigConstants {

  val DATABASE_CONFIG = "connect.mongo.database"
  val DATABASE_CONFIG_DOC = "The mongodb target database."


  val CONNECTION_CONFIG = "connect.mongo.connection"
  val CONNECTION_CONFIG_DOC = "The mongodb connection in the format mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]."

  val BATCH_SIZE_CONFIG = "connect.mongo.sink.batch.size"
  val BATCH_SIZE_DOC = "The number of records the sink would push to mongo at once."
  val BATCH_SIZE_CONFIG_DEFAULT = 100

  val ERROR_POLICY_CONFIG = "connect.mongo.error.policy"
  val ERROR_POLICY_DOC: String =
    """Specifies the action to be taken if an error occurs while inserting the data.
      |There are two available options:
      |NOOP - the error is swallowed
      |THROW - the error is allowed to propagate.
      |RETRY - The exception causes the Connect framework to retry the message. The number of retries is based on
      |The error will be logged automatically
    """.stripMargin

  val ERROR_POLICY_DEFAULT = "THROW"

  val ERROR_RETRY_INTERVAL_CONFIG = "connect.mongo.retry.interval"
  val ERROR_RETRY_INTERVAL_DOC = "The time in milliseconds between retries."
  val ERROR_RETRY_INTERVAL_DEFAULT = "60000"

  val NBR_OF_RETRIES_CONFIG = "connect.mongo.max.retries"
  val NBR_OF_RETRIES_DOC = "The maximum number of times to try the write again."
  val NBR_OF_RETIRES_DEFAULT = 20

  val KCQL_CONFIG = "connect.mongo.sink.kcql"
  val KCQL_DOC = "KCQL expression describing field selection and data routing to the target mongo db."
}
