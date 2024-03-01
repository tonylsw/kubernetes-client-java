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
 * Defines the runtime reloadable configuration of the timeseries database (TSDB).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1PrometheusSpecTsdb {
  public static final String SERIALIZED_NAME_OUT_OF_ORDER_TIME_WINDOW = "outOfOrderTimeWindow";
  @SerializedName(SERIALIZED_NAME_OUT_OF_ORDER_TIME_WINDOW)
  private String outOfOrderTimeWindow;

  public V1PrometheusSpecTsdb() {
  }

  public V1PrometheusSpecTsdb outOfOrderTimeWindow(String outOfOrderTimeWindow) {
    
    this.outOfOrderTimeWindow = outOfOrderTimeWindow;
    return this;
  }

   /**
   * Configures how old an out-of-order/out-of-bounds sample can be w.r.t. the TSDB max time. An out-of-order/out-of-bounds sample is ingested into the TSDB as long as the timestamp of the sample is &gt;&#x3D; (TSDB.MaxTime - outOfOrderTimeWindow). Out of order ingestion is an experimental feature and requires Prometheus &gt;&#x3D; v2.39.0.
   * @return outOfOrderTimeWindow
  **/
  @jakarta.annotation.Nullable
  public String getOutOfOrderTimeWindow() {
    return outOfOrderTimeWindow;
  }


  public void setOutOfOrderTimeWindow(String outOfOrderTimeWindow) {
    this.outOfOrderTimeWindow = outOfOrderTimeWindow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecTsdb v1PrometheusSpecTsdb = (V1PrometheusSpecTsdb) o;
    return Objects.equals(this.outOfOrderTimeWindow, v1PrometheusSpecTsdb.outOfOrderTimeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outOfOrderTimeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecTsdb {\n");
    sb.append("    outOfOrderTimeWindow: ").append(toIndentedString(outOfOrderTimeWindow)).append("\n");
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
    openapiFields.add("outOfOrderTimeWindow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PrometheusSpecTsdb
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PrometheusSpecTsdb.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PrometheusSpecTsdb is not found in the empty JSON string", V1PrometheusSpecTsdb.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PrometheusSpecTsdb.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PrometheusSpecTsdb` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("outOfOrderTimeWindow") != null && !jsonObj.get("outOfOrderTimeWindow").isJsonNull()) && !jsonObj.get("outOfOrderTimeWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outOfOrderTimeWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outOfOrderTimeWindow").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PrometheusSpecTsdb.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PrometheusSpecTsdb' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PrometheusSpecTsdb> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PrometheusSpecTsdb.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PrometheusSpecTsdb>() {
           @Override
           public void write(JsonWriter out, V1PrometheusSpecTsdb value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PrometheusSpecTsdb read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PrometheusSpecTsdb given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PrometheusSpecTsdb
  * @throws IOException if the JSON string is invalid with respect to V1PrometheusSpecTsdb
  */
  public static V1PrometheusSpecTsdb fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PrometheusSpecTsdb.class);
  }

 /**
  * Convert an instance of V1PrometheusSpecTsdb to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

