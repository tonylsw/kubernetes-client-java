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
import com.coreos.monitoring.models.V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa;
import com.coreos.monitoring.models.V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert;
import com.coreos.monitoring.models.V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret;
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
 * TLS configuration to use when scraping the endpoint.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig {
  public static final String SERIALIZED_NAME_CA = "ca";
  @SerializedName(SERIALIZED_NAME_CA)
  private V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa ca;

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  private V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert cert;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_VERIFY = "insecureSkipVerify";
  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_VERIFY)
  private Boolean insecureSkipVerify;

  public static final String SERIALIZED_NAME_KEY_SECRET = "keySecret";
  @SerializedName(SERIALIZED_NAME_KEY_SECRET)
  private V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret keySecret;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig() {
  }

  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig ca(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa ca) {
    
    this.ca = ca;
    return this;
  }

   /**
   * Get ca
   * @return ca
  **/
  @jakarta.annotation.Nullable
  public V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa getCa() {
    return ca;
  }


  public void setCa(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa ca) {
    this.ca = ca;
  }


  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig cert(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert cert) {
    
    this.cert = cert;
    return this;
  }

   /**
   * Get cert
   * @return cert
  **/
  @jakarta.annotation.Nullable
  public V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert getCert() {
    return cert;
  }


  public void setCert(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert cert) {
    this.cert = cert;
  }


  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig insecureSkipVerify(Boolean insecureSkipVerify) {
    
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * Disable target certificate validation.
   * @return insecureSkipVerify
  **/
  @jakarta.annotation.Nullable
  public Boolean getInsecureSkipVerify() {
    return insecureSkipVerify;
  }


  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }


  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig keySecret(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret keySecret) {
    
    this.keySecret = keySecret;
    return this;
  }

   /**
   * Get keySecret
   * @return keySecret
  **/
  @jakarta.annotation.Nullable
  public V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret getKeySecret() {
    return keySecret;
  }


  public void setKeySecret(V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret keySecret) {
    this.keySecret = keySecret;
  }


  public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Used to verify the hostname for the targets.
   * @return serverName
  **/
  @jakarta.annotation.Nullable
  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig = (V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig) o;
    return Objects.equals(this.ca, v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.ca) &&
        Objects.equals(this.cert, v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.cert) &&
        Objects.equals(this.insecureSkipVerify, v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.insecureSkipVerify) &&
        Objects.equals(this.keySecret, v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.keySecret) &&
        Objects.equals(this.serverName, v1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ca, cert, insecureSkipVerify, keySecret, serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig {\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    keySecret: ").append(toIndentedString(keySecret)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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
    openapiFields.add("ca");
    openapiFields.add("cert");
    openapiFields.add("insecureSkipVerify");
    openapiFields.add("keySecret");
    openapiFields.add("serverName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig is not found in the empty JSON string", V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ca`
      if (jsonObj.get("ca") != null && !jsonObj.get("ca").isJsonNull()) {
        V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCa.validateJsonObject(jsonObj.getAsJsonObject("ca"));
      }
      // validate the optional field `cert`
      if (jsonObj.get("cert") != null && !jsonObj.get("cert").isJsonNull()) {
        V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigCert.validateJsonObject(jsonObj.getAsJsonObject("cert"));
      }
      // validate the optional field `keySecret`
      if (jsonObj.get("keySecret") != null && !jsonObj.get("keySecret").isJsonNull()) {
        V1AlertmanagerSpecAlertmanagerConfigurationGlobalHttpConfigTlsConfigKeySecret.validateJsonObject(jsonObj.getAsJsonObject("keySecret"));
      }
      if ((jsonObj.get("serverName") != null && !jsonObj.get("serverName").isJsonNull()) && !jsonObj.get("serverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig>() {
           @Override
           public void write(JsonWriter out, V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig
  * @throws IOException if the JSON string is invalid with respect to V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig
  */
  public static V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig.class);
  }

 /**
  * Convert an instance of V1PodMonitorSpecPodMetricsEndpointsInnerTlsConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

