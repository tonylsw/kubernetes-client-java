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


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1ClusterIssuerStatusAcme;
import io.cert.manager.models.V1ClusterIssuerStatusConditionsInner;
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
 * Status of the Issuer. This is set and managed automatically.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1IssuerStatus {
  public static final String SERIALIZED_NAME_ACME = "acme";
  @SerializedName(SERIALIZED_NAME_ACME)
  private V1ClusterIssuerStatusAcme acme;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1ClusterIssuerStatusConditionsInner> conditions;

  public V1IssuerStatus() {
  }

  public V1IssuerStatus acme(V1ClusterIssuerStatusAcme acme) {
    
    this.acme = acme;
    return this;
  }

   /**
   * Get acme
   * @return acme
  **/
  @jakarta.annotation.Nullable
  public V1ClusterIssuerStatusAcme getAcme() {
    return acme;
  }


  public void setAcme(V1ClusterIssuerStatusAcme acme) {
    this.acme = acme;
  }


  public V1IssuerStatus conditions(List<V1ClusterIssuerStatusConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1IssuerStatus addConditionsItem(V1ClusterIssuerStatusConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * List of status conditions to indicate the status of a CertificateRequest. Known condition types are &#x60;Ready&#x60;.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1ClusterIssuerStatusConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1ClusterIssuerStatusConditionsInner> conditions) {
    this.conditions = conditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IssuerStatus v1IssuerStatus = (V1IssuerStatus) o;
    return Objects.equals(this.acme, v1IssuerStatus.acme) &&
        Objects.equals(this.conditions, v1IssuerStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acme, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IssuerStatus {\n");
    sb.append("    acme: ").append(toIndentedString(acme)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
    openapiFields.add("acme");
    openapiFields.add("conditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1IssuerStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1IssuerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IssuerStatus is not found in the empty JSON string", V1IssuerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1IssuerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IssuerStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `acme`
      if (jsonObj.get("acme") != null && !jsonObj.get("acme").isJsonNull()) {
        V1ClusterIssuerStatusAcme.validateJsonObject(jsonObj.getAsJsonObject("acme"));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1ClusterIssuerStatusConditionsInner.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IssuerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IssuerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IssuerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IssuerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IssuerStatus>() {
           @Override
           public void write(JsonWriter out, V1IssuerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IssuerStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1IssuerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1IssuerStatus
  * @throws IOException if the JSON string is invalid with respect to V1IssuerStatus
  */
  public static V1IssuerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IssuerStatus.class);
  }

 /**
  * Convert an instance of V1IssuerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

