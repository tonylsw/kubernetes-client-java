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
 * Exec specifies the action to take.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1AlertmanagerSpecContainersInnerLifecyclePostStartExec {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command;

  public V1AlertmanagerSpecContainersInnerLifecyclePostStartExec() {
  }

  public V1AlertmanagerSpecContainersInnerLifecyclePostStartExec command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1AlertmanagerSpecContainersInnerLifecyclePostStartExec addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Command is the command line to execute inside the container, the working directory for the command  is root (&#39;/&#39;) in the container&#39;s filesystem. The command is simply exec&#39;d, it is not run inside a shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
   * @return command
  **/
  @jakarta.annotation.Nullable
  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerSpecContainersInnerLifecyclePostStartExec v1AlertmanagerSpecContainersInnerLifecyclePostStartExec = (V1AlertmanagerSpecContainersInnerLifecyclePostStartExec) o;
    return Objects.equals(this.command, v1AlertmanagerSpecContainersInnerLifecyclePostStartExec.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecContainersInnerLifecyclePostStartExec {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
    openapiFields.add("command");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AlertmanagerSpecContainersInnerLifecyclePostStartExec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AlertmanagerSpecContainersInnerLifecyclePostStartExec is not found in the empty JSON string", V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AlertmanagerSpecContainersInnerLifecyclePostStartExec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AlertmanagerSpecContainersInnerLifecyclePostStartExec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AlertmanagerSpecContainersInnerLifecyclePostStartExec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AlertmanagerSpecContainersInnerLifecyclePostStartExec>() {
           @Override
           public void write(JsonWriter out, V1AlertmanagerSpecContainersInnerLifecyclePostStartExec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AlertmanagerSpecContainersInnerLifecyclePostStartExec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AlertmanagerSpecContainersInnerLifecyclePostStartExec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AlertmanagerSpecContainersInnerLifecyclePostStartExec
  * @throws IOException if the JSON string is invalid with respect to V1AlertmanagerSpecContainersInnerLifecyclePostStartExec
  */
  public static V1AlertmanagerSpecContainersInnerLifecyclePostStartExec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AlertmanagerSpecContainersInnerLifecyclePostStartExec.class);
  }

 /**
  * Convert an instance of V1AlertmanagerSpecContainersInnerLifecyclePostStartExec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

