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
import com.coreos.monitoring.models.V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth;
import com.coreos.monitoring.models.V1PrometheusSpecApiserverConfigAuthorization;
import com.coreos.monitoring.models.V1PrometheusSpecApiserverConfigTlsConfig;
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
 * APIServerConfig allows specifying a host and auth methods to access apiserver. If left empty, Prometheus is assumed to run inside of the cluster and will discover API servers automatically and use the pod&#39;s CA certificate and bearer token file at /var/run/secrets/kubernetes.io/serviceaccount/.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1PrometheusSpecApiserverConfig {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private V1PrometheusSpecApiserverConfigAuthorization authorization;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN = "bearerToken";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
  private String bearerToken;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecApiserverConfigTlsConfig tlsConfig;

  public V1PrometheusSpecApiserverConfig() {
  }

  public V1PrometheusSpecApiserverConfig authorization(V1PrometheusSpecApiserverConfigAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @jakarta.annotation.Nullable
  public V1PrometheusSpecApiserverConfigAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(V1PrometheusSpecApiserverConfigAuthorization authorization) {
    this.authorization = authorization;
  }


  public V1PrometheusSpecApiserverConfig basicAuth(V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth basicAuth) {
    
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


  public V1PrometheusSpecApiserverConfig bearerToken(String bearerToken) {
    
    this.bearerToken = bearerToken;
    return this;
  }

   /**
   * Bearer token for accessing apiserver.
   * @return bearerToken
  **/
  @jakarta.annotation.Nullable
  public String getBearerToken() {
    return bearerToken;
  }


  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }


  public V1PrometheusSpecApiserverConfig bearerTokenFile(String bearerTokenFile) {
    
    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

   /**
   * File to read bearer token for accessing apiserver.
   * @return bearerTokenFile
  **/
  @jakarta.annotation.Nullable
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }


  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }


  public V1PrometheusSpecApiserverConfig host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host of apiserver. A valid string consisting of a hostname or IP followed by an optional port number
   * @return host
  **/
  @jakarta.annotation.Nonnull
  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public V1PrometheusSpecApiserverConfig tlsConfig(V1PrometheusSpecApiserverConfigTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @jakarta.annotation.Nullable
  public V1PrometheusSpecApiserverConfigTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(V1PrometheusSpecApiserverConfigTlsConfig tlsConfig) {
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
    V1PrometheusSpecApiserverConfig v1PrometheusSpecApiserverConfig = (V1PrometheusSpecApiserverConfig) o;
    return Objects.equals(this.authorization, v1PrometheusSpecApiserverConfig.authorization) &&
        Objects.equals(this.basicAuth, v1PrometheusSpecApiserverConfig.basicAuth) &&
        Objects.equals(this.bearerToken, v1PrometheusSpecApiserverConfig.bearerToken) &&
        Objects.equals(this.bearerTokenFile, v1PrometheusSpecApiserverConfig.bearerTokenFile) &&
        Objects.equals(this.host, v1PrometheusSpecApiserverConfig.host) &&
        Objects.equals(this.tlsConfig, v1PrometheusSpecApiserverConfig.tlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, basicAuth, bearerToken, bearerTokenFile, host, tlsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecApiserverConfig {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
    openapiFields.add("authorization");
    openapiFields.add("basicAuth");
    openapiFields.add("bearerToken");
    openapiFields.add("bearerTokenFile");
    openapiFields.add("host");
    openapiFields.add("tlsConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("host");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PrometheusSpecApiserverConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PrometheusSpecApiserverConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PrometheusSpecApiserverConfig is not found in the empty JSON string", V1PrometheusSpecApiserverConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PrometheusSpecApiserverConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PrometheusSpecApiserverConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PrometheusSpecApiserverConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        V1PrometheusSpecApiserverConfigAuthorization.validateJsonObject(jsonObj.getAsJsonObject("authorization"));
      }
      // validate the optional field `basicAuth`
      if (jsonObj.get("basicAuth") != null && !jsonObj.get("basicAuth").isJsonNull()) {
        V1PrometheusSpecAlertingAlertmanagersInnerBasicAuth.validateJsonObject(jsonObj.getAsJsonObject("basicAuth"));
      }
      if ((jsonObj.get("bearerToken") != null && !jsonObj.get("bearerToken").isJsonNull()) && !jsonObj.get("bearerToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bearerToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bearerToken").toString()));
      }
      if ((jsonObj.get("bearerTokenFile") != null && !jsonObj.get("bearerTokenFile").isJsonNull()) && !jsonObj.get("bearerTokenFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bearerTokenFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bearerTokenFile").toString()));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // validate the optional field `tlsConfig`
      if (jsonObj.get("tlsConfig") != null && !jsonObj.get("tlsConfig").isJsonNull()) {
        V1PrometheusSpecApiserverConfigTlsConfig.validateJsonObject(jsonObj.getAsJsonObject("tlsConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PrometheusSpecApiserverConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PrometheusSpecApiserverConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PrometheusSpecApiserverConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PrometheusSpecApiserverConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PrometheusSpecApiserverConfig>() {
           @Override
           public void write(JsonWriter out, V1PrometheusSpecApiserverConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PrometheusSpecApiserverConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PrometheusSpecApiserverConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PrometheusSpecApiserverConfig
  * @throws IOException if the JSON string is invalid with respect to V1PrometheusSpecApiserverConfig
  */
  public static V1PrometheusSpecApiserverConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PrometheusSpecApiserverConfig.class);
  }

 /**
  * Convert an instance of V1PrometheusSpecApiserverConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

