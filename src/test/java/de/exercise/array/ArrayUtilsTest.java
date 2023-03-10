/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.exercise.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

  @Test
  public void createArray() {
    int[] result = ArrayUtils.createValuedArray(10);
    int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void revertInt() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] result = ArrayUtils.revert(array);
    int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    Assertions.assertArrayEquals(expected, result);
  }
}
