/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.coreos.monitoring.models;

import java.util.Objects;
import java.util.Arrays;
import com.coreos.monitoring.models.V1PrometheusSpecAlertingAlertmanagersInnerAuthorization;
import com.coreos.monitoring.models.V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth;
import com.coreos.monitoring.models.V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * AlertmanagerEndpoints defines a selection of a single Endpoints object containing alertmanager IPs to fire alerts against.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1PrometheusSpecAlertingAlertmanagersInner {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private V1PrometheusSpecAlertingAlertmanagersInnerAuthorization authorization;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_ENABLE_HTTP2 = "enableHttp2";
  @SerializedName(SERIALIZED_NAME_ENABLE_HTTP2)
  private Boolean enableHttp2;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PATH_PREFIX = "pathPrefix";
  @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
  private String pathPrefix;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig tlsConfig;

  public V1PrometheusSpecAlertingAlertmanagersInner() {
  }

  public V1PrometheusSpecAlertingAlertmanagersInner apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Version of the Alertmanager API that Prometheus uses to send alerts. It can be \&quot;v1\&quot; or \&quot;v2\&quot;.
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner authorization(V1PrometheusSpecAlertingAlertmanagersInnerAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @jakarta.annotation.Nullable
  public V1PrometheusSpecAlertingAlertmanagersInnerAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(V1PrometheusSpecAlertingAlertmanagersInnerAuthorization authorization) {
    this.authorization = authorization;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner basicAuth(V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @jakarta.annotation.Nullable
  public V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner bearerTokenFile(String bearerTokenFile) {
    
    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

   /**
   * BearerTokenFile to read from filesystem to use when authenticating to Alertmanager.
   * @return bearerTokenFile
  **/
  @jakarta.annotation.Nullable
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }


  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner enableHttp2(Boolean enableHttp2) {
    
    this.enableHttp2 = enableHttp2;
    return this;
  }

   /**
   * Whether to enable HTTP2.
   * @return enableHttp2
  **/
  @jakarta.annotation.Nullable
  public Boolean getEnableHttp2() {
    return enableHttp2;
  }


  public void setEnableHttp2(Boolean enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of Endpoints object in Namespace.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of Endpoints object.
   * @return namespace
  **/
  @jakarta.annotation.Nonnull
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner pathPrefix(String pathPrefix) {
    
    this.pathPrefix = pathPrefix;
    return this;
  }

   /**
   * Prefix for the HTTP path alerts are pushed to.
   * @return pathPrefix
  **/
  @jakarta.annotation.Nullable
  public String getPathPrefix() {
    return pathPrefix;
  }


  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner port(Object port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port the Alertmanager API is exposed on.
   * @return port
  **/
  @jakarta.annotation.Nonnull
  public Object getPort() {
    return port;
  }


  public void setPort(Object port) {
    this.port = port;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Scheme to use when firing alerts.
   * @return scheme
  **/
  @jakarta.annotation.Nullable
  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout is a per-target Alertmanager timeout when pushing alerts.
   * @return timeout
  **/
  @jakarta.annotation.Nullable
  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public V1PrometheusSpecAlertingAlertmanagersInner tlsConfig(V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @jakarta.annotation.Nullable
  public V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecAlertingAlertmanagersInner v1PrometheusSpecAlertingAlertmanagersInner = (V1PrometheusSpecAlertingAlertmanagersInner) o;
    return Objects.equals(this.apiVersion, v1PrometheusSpecAlertingAlertmanagersInner.apiVersion) &&
        Objects.equals(this.authorization, v1PrometheusSpecAlertingAlertmanagersInner.authorization) &&
        Objects.equals(this.basicAuth, v1PrometheusSpecAlertingAlertmanagersInner.basicAuth) &&
        Objects.equals(this.bearerTokenFile, v1PrometheusSpecAlertingAlertmanagersInner.bearerTokenFile) &&
        Objects.equals(this.enableHttp2, v1PrometheusSpecAlertingAlertmanagersInner.enableHttp2) &&
        Objects.equals(this.name, v1PrometheusSpecAlertingAlertmanagersInner.name) &&
        Objects.equals(this.namespace, v1PrometheusSpecAlertingAlertmanagersInner.namespace) &&
        Objects.equals(this.pathPrefix, v1PrometheusSpecAlertingAlertmanagersInner.pathPrefix) &&
        Objects.equals(this.port, v1PrometheusSpecAlertingAlertmanagersInner.port) &&
        Objects.equals(this.scheme, v1PrometheusSpecAlertingAlertmanagersInner.scheme) &&
        Objects.equals(this.timeout, v1PrometheusSpecAlertingAlertmanagersInner.timeout) &&
        Objects.equals(this.tlsConfig, v1PrometheusSpecAlertingAlertmanagersInner.tlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, authorization, basicAuth, bearerTokenFile, enableHttp2, name, namespace, pathPrefix, port, scheme, timeout, tlsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecAlertingAlertmanagersInner {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("apiVersion");
    openapiFields.add("authorization");
    openapiFields.add("basicAuth");
    openapiFields.add("bearerTokenFile");
    openapiFields.add("enableHttp2");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("pathPrefix");
    openapiFields.add("port");
    openapiFields.add("scheme");
    openapiFields.add("timeout");
    openapiFields.add("tlsConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("namespace");
    openapiRequiredFields.add("port");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PrometheusSpecAlertingAlertmanagersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PrometheusSpecAlertingAlertmanagersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PrometheusSpecAlertingAlertmanagersInner is not found in the empty JSON string", V1PrometheusSpecAlertingAlertmanagersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PrometheusSpecAlertingAlertmanagersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PrometheusSpecAlertingAlertmanagersInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PrometheusSpecAlertingAlertmanagersInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        V1PrometheusSpecAlertingAlertmanagersInnerAuthorization.validateJsonObject(jsonObj.getAsJsonObject("authorization"));
      }
      // validate the optional field `basicAuth`
      if (jsonObj.get("basicAuth") != null && !jsonObj.get("basicAuth").isJsonNull()) {
        V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth.validateJsonObject(jsonObj.getAsJsonObject("basicAuth"));
      }
      if ((jsonObj.get("bearerTokenFile") != null && !jsonObj.get("bearerTokenFile").isJsonNull()) && !jsonObj.get("bearerTokenFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bearerTokenFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bearerTokenFile").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("pathPrefix") != null && !jsonObj.get("pathPrefix").isJsonNull()) && !jsonObj.get("pathPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pathPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pathPrefix").toString()));
      }
      if ((jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) && !jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
      // validate the optional field `tlsConfig`
      if (jsonObj.get("tlsConfig") != null && !jsonObj.get("tlsConfig").isJsonNull()) {
        V1PrometheusSpecAlertingAlertmanagersInnerTlsConfig.validateJsonObject(jsonObj.getAsJsonObject("tlsConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PrometheusSpecAlertingAlertmanagersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PrometheusSpecAlertingAlertmanagersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PrometheusSpecAlertingAlertmanagersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PrometheusSpecAlertingAlertmanagersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PrometheusSpecAlertingAlertmanagersInner>() {
           @Override
           public void write(JsonWriter out, V1PrometheusSpecAlertingAlertmanagersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PrometheusSpecAlertingAlertmanagersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PrometheusSpecAlertingAlertmanagersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PrometheusSpecAlertingAlertmanagersInner
  * @throws IOException if the JSON string is invalid with respect to V1PrometheusSpecAlertingAlertmanagersInner
  */
  public static V1PrometheusSpecAlertingAlertmanagersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PrometheusSpecAlertingAlertmanagersInner.class);
  }

 /**
  * Convert an instance of V1PrometheusSpecAlertingAlertmanagersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

