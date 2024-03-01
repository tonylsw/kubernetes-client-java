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
import com.coreos.monitoring.models.V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner;
import com.coreos.monitoring.models.V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Describes node affinity scheduling rules for the pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1AlertmanagerSpecAffinityNodeAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "preferredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "requiredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

  public V1AlertmanagerSpecAffinityNodeAffinity() {
  }

  public V1AlertmanagerSpecAffinityNodeAffinity preferredDuringSchedulingIgnoredDuringExecution(List<V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution) {
    
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1AlertmanagerSpecAffinityNodeAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public List<V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }


  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }


  public V1AlertmanagerSpecAffinityNodeAffinity requiredDuringSchedulingIgnoredDuringExecution(V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
    
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

   /**
   * Get requiredDuringSchedulingIgnoredDuringExecution
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }


  public void setRequiredDuringSchedulingIgnoredDuringExecution(V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerSpecAffinityNodeAffinity v1AlertmanagerSpecAffinityNodeAffinity = (V1AlertmanagerSpecAffinityNodeAffinity) o;
    return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution, v1AlertmanagerSpecAffinityNodeAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution, v1AlertmanagerSpecAffinityNodeAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecAffinityNodeAffinity {\n");
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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
    openapiFields.add("preferredDuringSchedulingIgnoredDuringExecution");
    openapiFields.add("requiredDuringSchedulingIgnoredDuringExecution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AlertmanagerSpecAffinityNodeAffinity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AlertmanagerSpecAffinityNodeAffinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AlertmanagerSpecAffinityNodeAffinity is not found in the empty JSON string", V1AlertmanagerSpecAffinityNodeAffinity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AlertmanagerSpecAffinityNodeAffinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AlertmanagerSpecAffinityNodeAffinity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        JsonArray jsonArraypreferredDuringSchedulingIgnoredDuringExecution = jsonObj.getAsJsonArray("preferredDuringSchedulingIgnoredDuringExecution");
        if (jsonArraypreferredDuringSchedulingIgnoredDuringExecution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preferredDuringSchedulingIgnoredDuringExecution` to be an array in the JSON string but got `%s`", jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").toString()));
          }

          // validate the optional field `preferredDuringSchedulingIgnoredDuringExecution` (array)
          for (int i = 0; i < jsonArraypreferredDuringSchedulingIgnoredDuringExecution.size(); i++) {
            V1AlertmanagerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.validateJsonObject(jsonArraypreferredDuringSchedulingIgnoredDuringExecution.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `requiredDuringSchedulingIgnoredDuringExecution`
      if (jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        V1AlertmanagerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution.validateJsonObject(jsonObj.getAsJsonObject("requiredDuringSchedulingIgnoredDuringExecution"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AlertmanagerSpecAffinityNodeAffinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AlertmanagerSpecAffinityNodeAffinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AlertmanagerSpecAffinityNodeAffinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AlertmanagerSpecAffinityNodeAffinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AlertmanagerSpecAffinityNodeAffinity>() {
           @Override
           public void write(JsonWriter out, V1AlertmanagerSpecAffinityNodeAffinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AlertmanagerSpecAffinityNodeAffinity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AlertmanagerSpecAffinityNodeAffinity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AlertmanagerSpecAffinityNodeAffinity
  * @throws IOException if the JSON string is invalid with respect to V1AlertmanagerSpecAffinityNodeAffinity
  */
  public static V1AlertmanagerSpecAffinityNodeAffinity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AlertmanagerSpecAffinityNodeAffinity.class);
  }

 /**
  * Convert an instance of V1AlertmanagerSpecAffinityNodeAffinity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

