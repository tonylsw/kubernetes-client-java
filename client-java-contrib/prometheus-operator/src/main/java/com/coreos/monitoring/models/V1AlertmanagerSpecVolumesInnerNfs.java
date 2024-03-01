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
 * nfs represents an NFS mount on the host that shares a pod&#39;s lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1AlertmanagerSpecVolumesInnerNfs {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public V1AlertmanagerSpecVolumesInnerNfs() {
  }

  public V1AlertmanagerSpecVolumesInnerNfs path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return path
  **/
  @jakarta.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1AlertmanagerSpecVolumesInnerNfs readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1AlertmanagerSpecVolumesInnerNfs server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return server
  **/
  @jakarta.annotation.Nonnull
  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerSpecVolumesInnerNfs v1AlertmanagerSpecVolumesInnerNfs = (V1AlertmanagerSpecVolumesInnerNfs) o;
    return Objects.equals(this.path, v1AlertmanagerSpecVolumesInnerNfs.path) &&
        Objects.equals(this.readOnly, v1AlertmanagerSpecVolumesInnerNfs.readOnly) &&
        Objects.equals(this.server, v1AlertmanagerSpecVolumesInnerNfs.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, readOnly, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecVolumesInnerNfs {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
    openapiFields.add("path");
    openapiFields.add("readOnly");
    openapiFields.add("server");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("server");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AlertmanagerSpecVolumesInnerNfs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AlertmanagerSpecVolumesInnerNfs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AlertmanagerSpecVolumesInnerNfs is not found in the empty JSON string", V1AlertmanagerSpecVolumesInnerNfs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AlertmanagerSpecVolumesInnerNfs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AlertmanagerSpecVolumesInnerNfs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AlertmanagerSpecVolumesInnerNfs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AlertmanagerSpecVolumesInnerNfs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AlertmanagerSpecVolumesInnerNfs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AlertmanagerSpecVolumesInnerNfs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AlertmanagerSpecVolumesInnerNfs.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AlertmanagerSpecVolumesInnerNfs>() {
           @Override
           public void write(JsonWriter out, V1AlertmanagerSpecVolumesInnerNfs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AlertmanagerSpecVolumesInnerNfs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AlertmanagerSpecVolumesInnerNfs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AlertmanagerSpecVolumesInnerNfs
  * @throws IOException if the JSON string is invalid with respect to V1AlertmanagerSpecVolumesInnerNfs
  */
  public static V1AlertmanagerSpecVolumesInnerNfs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AlertmanagerSpecVolumesInnerNfs.class);
  }

 /**
  * Convert an instance of V1AlertmanagerSpecVolumesInnerNfs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

