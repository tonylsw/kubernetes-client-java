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
 * References a properly configured ACME-type Issuer which should be used to create this Challenge. If the Issuer does not exist, processing will be retried. If the Issuer is not an &#39;ACME&#39; Issuer, an error will be returned and the Challenge will be marked as failed.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecIssuerRef {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1ChallengeSpecIssuerRef() {
  }

  public V1ChallengeSpecIssuerRef group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group of the resource being referred to.
   * @return group
  **/
  @jakarta.annotation.Nullable
  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1ChallengeSpecIssuerRef kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the resource being referred to.
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1ChallengeSpecIssuerRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource being referred to.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecIssuerRef v1ChallengeSpecIssuerRef = (V1ChallengeSpecIssuerRef) o;
    return Objects.equals(this.group, v1ChallengeSpecIssuerRef.group) &&
        Objects.equals(this.kind, v1ChallengeSpecIssuerRef.kind) &&
        Objects.equals(this.name, v1ChallengeSpecIssuerRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecIssuerRef {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("kind");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecIssuerRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecIssuerRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecIssuerRef is not found in the empty JSON string", V1ChallengeSpecIssuerRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecIssuerRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecIssuerRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ChallengeSpecIssuerRef.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecIssuerRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecIssuerRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecIssuerRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecIssuerRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecIssuerRef>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecIssuerRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecIssuerRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecIssuerRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecIssuerRef
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecIssuerRef
  */
  public static V1ChallengeSpecIssuerRef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecIssuerRef.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecIssuerRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

