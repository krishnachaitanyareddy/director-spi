// (c) Copyright 2015 Cloudera, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.director.spi.v1.model;

import java.util.Map;

/**
 * Represents a template for constructing cloud resources.
 */
public interface ResourceTemplate extends Configured {

  /**
   * Returns the name of the template.
   *
   * @return the name of the template
   */
  String getName();

  /**
   * Returns the map of tags to be applied to resources created from the template.
   *
   * @return the map of tags to be applied to resources created from the template
   */
  Map<String, String> getTags();

  /**
   * Return the underlying cloud provider specific implementation or null
   * <p/>
   * Intended for internal provider use only. The consumer of the API will not try
   * to use this in any way.
   */
  Object unwrap();

}
