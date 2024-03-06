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
 * V1ChallengeStatus
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeStatus {
  public static final String SERIALIZED_NAME_PRESENTED = "presented";
  @SerializedName(SERIALIZED_NAME_PRESENTED)
  private Boolean presented;

  public static final String SERIALIZED_NAME_PROCESSING = "processing";
  @SerializedName(SERIALIZED_NAME_PROCESSING)
  private Boolean processing;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * Contains the current &#39;state&#39; of the challenge. If not set, the state of the challenge is unknown.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    VALID("valid"),
    
    READY("ready"),
    
    PENDING("pending"),
    
    PROCESSING("processing"),
    
    INVALID("invalid"),
    
    EXPIRED("expired"),
    
    ERRORED("errored");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public V1ChallengeStatus() {
  }

  public V1ChallengeStatus presented(Boolean presented) {
    
    this.presented = presented;
    return this;
  }

   /**
   * presented will be set to true if the challenge values for this challenge are currently &#39;presented&#39;. This *does not* imply the self check is passing. Only that the values have been &#39;submitted&#39; for the appropriate challenge mechanism (i.e. the DNS01 TXT record has been presented, or the HTTP01 configuration has been configured).
   * @return presented
  **/
  @jakarta.annotation.Nullable
  public Boolean getPresented() {
    return presented;
  }


  public void setPresented(Boolean presented) {
    this.presented = presented;
  }


  public V1ChallengeStatus processing(Boolean processing) {
    
    this.processing = processing;
    return this;
  }

   /**
   * Used to denote whether this challenge should be processed or not. This field will only be set to true by the &#39;scheduling&#39; component. It will only be set to false by the &#39;challenges&#39; controller, after the challenge has reached a final state or timed out. If this field is set to false, the challenge controller will not take any more action.
   * @return processing
  **/
  @jakarta.annotation.Nullable
  public Boolean getProcessing() {
    return processing;
  }


  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }


  public V1ChallengeStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Contains human readable information on why the Challenge is in the current state.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1ChallengeStatus state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Contains the current &#39;state&#39; of the challenge. If not set, the state of the challenge is unknown.
   * @return state
  **/
  @jakarta.annotation.Nullable
  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeStatus v1ChallengeStatus = (V1ChallengeStatus) o;
    return Objects.equals(this.presented, v1ChallengeStatus.presented) &&
        Objects.equals(this.processing, v1ChallengeStatus.processing) &&
        Objects.equals(this.reason, v1ChallengeStatus.reason) &&
        Objects.equals(this.state, v1ChallengeStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presented, processing, reason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeStatus {\n");
    sb.append("    presented: ").append(toIndentedString(presented)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("presented");
    openapiFields.add("processing");
    openapiFields.add("reason");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeStatus is not found in the empty JSON string", V1ChallengeStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeStatus>() {
           @Override
           public void write(JsonWriter out, V1ChallengeStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeStatus
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeStatus
  */
  public static V1ChallengeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeStatus.class);
  }

 /**
  * Convert an instance of V1ChallengeStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

