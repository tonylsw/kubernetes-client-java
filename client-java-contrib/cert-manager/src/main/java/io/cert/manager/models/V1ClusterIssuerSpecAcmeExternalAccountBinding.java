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
import io.cert.manager.models.V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef;
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
 * ExternalAccountBinding is a reference to a CA external account of the ACME server. If set, upon registration cert-manager will attempt to associate the given external account credentials with the registered ACME account.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ClusterIssuerSpecAcmeExternalAccountBinding {
  /**
   * Deprecated: keyAlgorithm field exists for historical compatibility reasons and should not be used. The algorithm is now hardcoded to HS256 in golang/x/crypto/acme.
   */
  @JsonAdapter(KeyAlgorithmEnum.Adapter.class)
  public enum KeyAlgorithmEnum {
    HS256("HS256"),
    
    HS384("HS384"),
    
    HS512("HS512");

    private String value;

    KeyAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyAlgorithmEnum fromValue(String value) {
      for (KeyAlgorithmEnum b : KeyAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyAlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_ALGORITHM = "keyAlgorithm";
  @SerializedName(SERIALIZED_NAME_KEY_ALGORITHM)
  private KeyAlgorithmEnum keyAlgorithm;

  public static final String SERIALIZED_NAME_KEY_I_D = "keyID";
  @SerializedName(SERIALIZED_NAME_KEY_I_D)
  private String keyID;

  public static final String SERIALIZED_NAME_KEY_SECRET_REF = "keySecretRef";
  @SerializedName(SERIALIZED_NAME_KEY_SECRET_REF)
  private V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef;

  public V1ClusterIssuerSpecAcmeExternalAccountBinding() {
  }

  public V1ClusterIssuerSpecAcmeExternalAccountBinding keyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {
    
    this.keyAlgorithm = keyAlgorithm;
    return this;
  }

   /**
   * Deprecated: keyAlgorithm field exists for historical compatibility reasons and should not be used. The algorithm is now hardcoded to HS256 in golang/x/crypto/acme.
   * @return keyAlgorithm
  **/
  @jakarta.annotation.Nullable
  public KeyAlgorithmEnum getKeyAlgorithm() {
    return keyAlgorithm;
  }


  public void setKeyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
  }


  public V1ClusterIssuerSpecAcmeExternalAccountBinding keyID(String keyID) {
    
    this.keyID = keyID;
    return this;
  }

   /**
   * keyID is the ID of the CA key that the External Account is bound to.
   * @return keyID
  **/
  @jakarta.annotation.Nonnull
  public String getKeyID() {
    return keyID;
  }


  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }


  public V1ClusterIssuerSpecAcmeExternalAccountBinding keySecretRef(V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef) {
    
    this.keySecretRef = keySecretRef;
    return this;
  }

   /**
   * Get keySecretRef
   * @return keySecretRef
  **/
  @jakarta.annotation.Nonnull
  public V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef getKeySecretRef() {
    return keySecretRef;
  }


  public void setKeySecretRef(V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef) {
    this.keySecretRef = keySecretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterIssuerSpecAcmeExternalAccountBinding v1ClusterIssuerSpecAcmeExternalAccountBinding = (V1ClusterIssuerSpecAcmeExternalAccountBinding) o;
    return Objects.equals(this.keyAlgorithm, v1ClusterIssuerSpecAcmeExternalAccountBinding.keyAlgorithm) &&
        Objects.equals(this.keyID, v1ClusterIssuerSpecAcmeExternalAccountBinding.keyID) &&
        Objects.equals(this.keySecretRef, v1ClusterIssuerSpecAcmeExternalAccountBinding.keySecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlgorithm, keyID, keySecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterIssuerSpecAcmeExternalAccountBinding {\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    keySecretRef: ").append(toIndentedString(keySecretRef)).append("\n");
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
    openapiFields.add("keyAlgorithm");
    openapiFields.add("keyID");
    openapiFields.add("keySecretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keyID");
    openapiRequiredFields.add("keySecretRef");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ClusterIssuerSpecAcmeExternalAccountBinding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ClusterIssuerSpecAcmeExternalAccountBinding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterIssuerSpecAcmeExternalAccountBinding is not found in the empty JSON string", V1ClusterIssuerSpecAcmeExternalAccountBinding.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterIssuerSpecAcmeExternalAccountBinding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterIssuerSpecAcmeExternalAccountBinding` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClusterIssuerSpecAcmeExternalAccountBinding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("keyAlgorithm") != null && !jsonObj.get("keyAlgorithm").isJsonNull()) && !jsonObj.get("keyAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyAlgorithm").toString()));
      }
      if (!jsonObj.get("keyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyID").toString()));
      }
      // validate the required field `keySecretRef`
      V1ClusterIssuerSpecAcmeExternalAccountBindingKeySecretRef.validateJsonObject(jsonObj.getAsJsonObject("keySecretRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClusterIssuerSpecAcmeExternalAccountBinding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClusterIssuerSpecAcmeExternalAccountBinding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClusterIssuerSpecAcmeExternalAccountBinding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClusterIssuerSpecAcmeExternalAccountBinding.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClusterIssuerSpecAcmeExternalAccountBinding>() {
           @Override
           public void write(JsonWriter out, V1ClusterIssuerSpecAcmeExternalAccountBinding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClusterIssuerSpecAcmeExternalAccountBinding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ClusterIssuerSpecAcmeExternalAccountBinding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ClusterIssuerSpecAcmeExternalAccountBinding
  * @throws IOException if the JSON string is invalid with respect to V1ClusterIssuerSpecAcmeExternalAccountBinding
  */
  public static V1ClusterIssuerSpecAcmeExternalAccountBinding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClusterIssuerSpecAcmeExternalAccountBinding.class);
  }

 /**
  * Convert an instance of V1ClusterIssuerSpecAcmeExternalAccountBinding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

