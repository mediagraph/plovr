/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.data.restricted;

import com.google.template.soy.data.SoyDataException;

import javax.annotation.concurrent.Immutable;


/**
 * Undefined data.
 *
 * <p> Important: This class may only be used in implementing plugins (e.g. functions, directives).
 *
 */
@Immutable
public final class UndefinedData extends PrimitiveData {


  /** Static singleton instance of UndefinedData. */
  @SuppressWarnings("deprecation")
  public static final UndefinedData INSTANCE = new UndefinedData();


  /**
   * @deprecated Use {@link UndefinedData#INSTANCE}.
   */
  @Deprecated
  public UndefinedData() {}


  @Override public String toString() {
    throw new SoyDataException("Attempted to coerce undefined value into a string.");
  }


  /**
   * {@inheritDoc}
   *
   * <p> Undefined is falsy.
   */
  @Deprecated
  @Override public boolean toBoolean() {
    return false;
  }


  @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
  @Override public boolean equals(Object other) {
    return this == other;  // only equal if exact same UndefinedData object
  }


  @Override public int hashCode() {
    return super.hashCode();
  }

}
