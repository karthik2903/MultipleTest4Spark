package com.tritcorp.mt4s.scalaTest
/* MT4S - Multiple Tests 4 Spark - a simple Junit/Scalatest testing framework for spark
* Copyright (C) 2018  Gauthier LYAN
*
*
*Licensed under the Apache License, Version 2.0 (the "License");
*you may not use this file except in compliance with the License.
*You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing, software
*distributed under the License is distributed on an "AS IS" BASIS,
*WITHOUT WARRANTIES OR *CONDITIONS OF ANY KIND, either express or implied.
*See the License for the specific language governing permissions and
*limitations under the License.
*/

import com.tritcorp.mt4s.TestBase
import com.typesafe.scalalogging.LazyLogging
import org.scalatest.{FeatureSpec, GivenWhenThen}

abstract class FeatureSpecTest extends FeatureSpec with TestBase with LazyLogging with GivenWhenThen{

}
