/*
 *
 *  The contents of this file are subject to the Terracotta Public License Version
 *  2.0 (the "License"); You may not use this file except in compliance with the
 *  License. You may obtain a copy of the License at
 *
 *  http://terracotta.org/legal/terracotta-public-license.
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 *  the specific language governing rights and limitations under the License.
 *
 *  The Covered Software is Connection API.
 *
 *  The Initial Developer of the Covered Software is
 *  Terracotta, Inc., a Software AG company
 *
 */
package org.terracotta.exception;


/**
 * This specific EntityException type is thrown in cases where an attempt was made to try to create an entity but no provider
 * existed for the requested entity class.
 */
public class EntityNotProvidedException extends EntityException {
  private static final long serialVersionUID = 1L;

  /**
   * Creates the exception instance describing the given type-name pair.
   * 
   * @param className The name of the entity type
   * @param entityName The name of the entity instance
   */
  public EntityNotProvidedException(String className, String entityName) {
    super(className, entityName, "no provider found for class", null);
  }

  /**
   * Creates the exception instance describing the given type-name pair along with underlying cause of this exception
   *
   * @param className The name of the entity type
   * @param entityName The name of the entity instance
   * @param cause underlying cause of this exception
   */
  public EntityNotProvidedException(String className, String entityName, Throwable cause) {
    super(className, entityName, "no provider found for class", cause);
  }
}
