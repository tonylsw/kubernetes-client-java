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
 * SelfSigned configures this issuer to &#39;self sign&#39; certificates using the private key used to create the CertificateRequest object.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ClusterIssuerSpecSelfSigned {
  public static final String SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS = "crlDistributionPoints";
  @SerializedName(SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS)
  private List<String> crlDistributionPoints;

  public V1ClusterIssuerSpecSelfSigned() {
  }

  public V1ClusterIssuerSpecSelfSigned crlDistributionPoints(List<String> crlDistributionPoints) {
    
    this.crlDistributionPoints = crlDistributionPoints;
    return this;
  }

  public V1ClusterIssuerSpecSelfSigned addCrlDistributionPointsItem(String crlDistributionPointsItem) {
    if (this.crlDistributionPoints == null) {
      this.crlDistributionPoints = new ArrayList<>();
    }
    this.crlDistributionPoints.add(crlDistributionPointsItem);
    return this;
  }

   /**
   * The CRL distribution points is an X.509 v3 certificate extension which identifies the location of the CRL from which the revocation of this certificate can be checked. If not set certificate will be issued without CDP. Values are strings.
   * @return crlDistributionPoints
  **/
  @jakarta.annotation.Nullable
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }


  public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterIssuerSpecSelfSigned v1ClusterIssuerSpecSelfSigned = (V1ClusterIssuerSpecSelfSigned) o;
    return Objects.equals(this.crlDistributionPoints, v1ClusterIssuerSpecSelfSigned.crlDistributionPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crlDistributionPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterIssuerSpecSelfSigned {\n");
    sb.append("    crlDistributionPoints: ").append(toIndentedString(crlDistributionPoints)).append("\n");
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
    openapiFields.add("crlDistributionPoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ClusterIssuerSpecSelfSigned
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ClusterIssuerSpecSelfSigned.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterIssuerSpecSelfSigned is not found in the empty JSON string", V1ClusterIssuerSpecSelfSigned.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterIssuerSpecSelfSigned.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterIssuerSpecSelfSigned` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("crlDistributionPoints") != null && !jsonObj.get("crlDistributionPoints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `crlDistributionPoints` to be an array in the JSON string but got `%s`", jsonObj.get("crlDistributionPoints").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClusterIssuerSpecSelfSigned.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClusterIssuerSpecSelfSigned' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClusterIssuerSpecSelfSigned> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClusterIssuerSpecSelfSigned.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClusterIssuerSpecSelfSigned>() {
           @Override
           public void write(JsonWriter out, V1ClusterIssuerSpecSelfSigned value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClusterIssuerSpecSelfSigned read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ClusterIssuerSpecSelfSigned given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ClusterIssuerSpecSelfSigned
  * @throws IOException if the JSON string is invalid with respect to V1ClusterIssuerSpecSelfSigned
  */
  public static V1ClusterIssuerSpecSelfSigned fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClusterIssuerSpecSelfSigned.class);
  }

 /**
  * Convert an instance of V1ClusterIssuerSpecSelfSigned to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

