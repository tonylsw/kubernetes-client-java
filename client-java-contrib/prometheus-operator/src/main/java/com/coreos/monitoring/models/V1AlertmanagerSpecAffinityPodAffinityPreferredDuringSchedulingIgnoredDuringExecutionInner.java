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
import com.coreos.monitoring.models.V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm;
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
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner() {
  }

  public V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner podAffinityTerm(V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm) {
    
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Get podAffinityTerm
   * @return podAffinityTerm
  **/
  @jakarta.annotation.Nonnull
  public V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }


  public void setPodAffinityTerm(V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @jakarta.annotation.Nonnull
  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner v1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner = (V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner) o;
    return Objects.equals(this.podAffinityTerm, v1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.podAffinityTerm) &&
        Objects.equals(this.weight, v1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("podAffinityTerm");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("podAffinityTerm");
    openapiRequiredFields.add("weight");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner is not found in the empty JSON string", V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `podAffinityTerm`
      V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.validateJsonObject(jsonObj.getAsJsonObject("podAffinityTerm"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner>() {
           @Override
           public void write(JsonWriter out, V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  * @throws IOException if the JSON string is invalid with respect to V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  */
  public static V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class);
  }

 /**
  * Convert an instance of V1AlertmanagerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

