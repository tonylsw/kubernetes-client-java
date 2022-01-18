/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public interface V1EventSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1EventSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getComponent();

  public A withComponent(java.lang.String component);

  public java.lang.Boolean hasComponent();

  /** Method is deprecated. use withComponent instead. */
  @java.lang.Deprecated
  public A withNewComponent(java.lang.String original);

  public java.lang.String getHost();

  public A withHost(java.lang.String host);

  public java.lang.Boolean hasHost();

  /** Method is deprecated. use withHost instead. */
  @java.lang.Deprecated
  public A withNewHost(java.lang.String original);
}
