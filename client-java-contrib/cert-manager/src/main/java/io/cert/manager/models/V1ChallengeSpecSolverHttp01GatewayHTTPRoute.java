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
import io.cert.manager.models.V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * The Gateway API is a sig-network community API that models service networking in Kubernetes (https://gateway-api.sigs.k8s.io/). The Gateway solver will create HTTPRoutes with the specified labels in the same namespace as the challenge. This solver is experimental, and fields / behaviour may change in the future.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecSolverHttp01GatewayHTTPRoute {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_PARENT_REFS = "parentRefs";
  @SerializedName(SERIALIZED_NAME_PARENT_REFS)
  private List<V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner> parentRefs;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute() {
  }

  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Custom labels that will be applied to HTTPRoutes created by cert-manager while solving HTTP-01 challenges.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute parentRefs(List<V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner> parentRefs) {
    
    this.parentRefs = parentRefs;
    return this;
  }

  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute addParentRefsItem(V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner parentRefsItem) {
    if (this.parentRefs == null) {
      this.parentRefs = new ArrayList<>();
    }
    this.parentRefs.add(parentRefsItem);
    return this;
  }

   /**
   * When solving an HTTP-01 challenge, cert-manager creates an HTTPRoute. cert-manager needs to know which parentRefs should be used when creating the HTTPRoute. Usually, the parentRef references a Gateway. See: https://gateway-api.sigs.k8s.io/api-types/httproute/#attaching-to-gateways
   * @return parentRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner> getParentRefs() {
    return parentRefs;
  }


  public void setParentRefs(List<V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner> parentRefs) {
    this.parentRefs = parentRefs;
  }


  public V1ChallengeSpecSolverHttp01GatewayHTTPRoute serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Optional service type for Kubernetes solver service. Supported values are NodePort or ClusterIP. If unset, defaults to NodePort.
   * @return serviceType
  **/
  @jakarta.annotation.Nullable
  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecSolverHttp01GatewayHTTPRoute v1ChallengeSpecSolverHttp01GatewayHTTPRoute = (V1ChallengeSpecSolverHttp01GatewayHTTPRoute) o;
    return Objects.equals(this.labels, v1ChallengeSpecSolverHttp01GatewayHTTPRoute.labels) &&
        Objects.equals(this.parentRefs, v1ChallengeSpecSolverHttp01GatewayHTTPRoute.parentRefs) &&
        Objects.equals(this.serviceType, v1ChallengeSpecSolverHttp01GatewayHTTPRoute.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, parentRefs, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecSolverHttp01GatewayHTTPRoute {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    parentRefs: ").append(toIndentedString(parentRefs)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("parentRefs");
    openapiFields.add("serviceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecSolverHttp01GatewayHTTPRoute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecSolverHttp01GatewayHTTPRoute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecSolverHttp01GatewayHTTPRoute is not found in the empty JSON string", V1ChallengeSpecSolverHttp01GatewayHTTPRoute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecSolverHttp01GatewayHTTPRoute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecSolverHttp01GatewayHTTPRoute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("parentRefs") != null && !jsonObj.get("parentRefs").isJsonNull()) {
        JsonArray jsonArrayparentRefs = jsonObj.getAsJsonArray("parentRefs");
        if (jsonArrayparentRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parentRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parentRefs` to be an array in the JSON string but got `%s`", jsonObj.get("parentRefs").toString()));
          }

          // validate the optional field `parentRefs` (array)
          for (int i = 0; i < jsonArrayparentRefs.size(); i++) {
            V1ChallengeSpecSolverHttp01GatewayHTTPRouteParentRefsInner.validateJsonObject(jsonArrayparentRefs.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("serviceType") != null && !jsonObj.get("serviceType").isJsonNull()) && !jsonObj.get("serviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecSolverHttp01GatewayHTTPRoute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecSolverHttp01GatewayHTTPRoute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecSolverHttp01GatewayHTTPRoute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecSolverHttp01GatewayHTTPRoute.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecSolverHttp01GatewayHTTPRoute>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecSolverHttp01GatewayHTTPRoute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecSolverHttp01GatewayHTTPRoute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecSolverHttp01GatewayHTTPRoute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecSolverHttp01GatewayHTTPRoute
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecSolverHttp01GatewayHTTPRoute
  */
  public static V1ChallengeSpecSolverHttp01GatewayHTTPRoute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecSolverHttp01GatewayHTTPRoute.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecSolverHttp01GatewayHTTPRoute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
