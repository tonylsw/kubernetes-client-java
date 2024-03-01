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
import com.coreos.monitoring.models.V1AlertmanagerSpecVolumesInnerRbdSecretRef;
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
 * rbd represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:02:10.169254Z[Etc/UTC]")
public class V1AlertmanagerSpecVolumesInnerRbd {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_KEYRING = "keyring";
  @SerializedName(SERIALIZED_NAME_KEYRING)
  private String keyring;

  public static final String SERIALIZED_NAME_MONITORS = "monitors";
  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1AlertmanagerSpecVolumesInnerRbdSecretRef secretRef;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1AlertmanagerSpecVolumesInnerRbd() {
  }

  public V1AlertmanagerSpecVolumesInnerRbd fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the filesystem from compromising the machine
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1AlertmanagerSpecVolumesInnerRbd image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return image
  **/
  @jakarta.annotation.Nonnull
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1AlertmanagerSpecVolumesInnerRbd keyring(String keyring) {
    
    this.keyring = keyring;
    return this;
  }

   /**
   * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return keyring
  **/
  @jakarta.annotation.Nullable
  public String getKeyring() {
    return keyring;
  }


  public void setKeyring(String keyring) {
    this.keyring = keyring;
  }


  public V1AlertmanagerSpecVolumesInnerRbd monitors(List<String> monitors) {
    
    this.monitors = monitors;
    return this;
  }

  public V1AlertmanagerSpecVolumesInnerRbd addMonitorsItem(String monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return monitors
  **/
  @jakarta.annotation.Nonnull
  public List<String> getMonitors() {
    return monitors;
  }


  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }


  public V1AlertmanagerSpecVolumesInnerRbd pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return pool
  **/
  @jakarta.annotation.Nullable
  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public V1AlertmanagerSpecVolumesInnerRbd readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1AlertmanagerSpecVolumesInnerRbd secretRef(V1AlertmanagerSpecVolumesInnerRbdSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public V1AlertmanagerSpecVolumesInnerRbdSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1AlertmanagerSpecVolumesInnerRbdSecretRef secretRef) {
    this.secretRef = secretRef;
  }


  public V1AlertmanagerSpecVolumesInnerRbd user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return user
  **/
  @jakarta.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerSpecVolumesInnerRbd v1AlertmanagerSpecVolumesInnerRbd = (V1AlertmanagerSpecVolumesInnerRbd) o;
    return Objects.equals(this.fsType, v1AlertmanagerSpecVolumesInnerRbd.fsType) &&
        Objects.equals(this.image, v1AlertmanagerSpecVolumesInnerRbd.image) &&
        Objects.equals(this.keyring, v1AlertmanagerSpecVolumesInnerRbd.keyring) &&
        Objects.equals(this.monitors, v1AlertmanagerSpecVolumesInnerRbd.monitors) &&
        Objects.equals(this.pool, v1AlertmanagerSpecVolumesInnerRbd.pool) &&
        Objects.equals(this.readOnly, v1AlertmanagerSpecVolumesInnerRbd.readOnly) &&
        Objects.equals(this.secretRef, v1AlertmanagerSpecVolumesInnerRbd.secretRef) &&
        Objects.equals(this.user, v1AlertmanagerSpecVolumesInnerRbd.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecVolumesInnerRbd {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keyring: ").append(toIndentedString(keyring)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("image");
    openapiFields.add("keyring");
    openapiFields.add("monitors");
    openapiFields.add("pool");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("monitors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AlertmanagerSpecVolumesInnerRbd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AlertmanagerSpecVolumesInnerRbd.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AlertmanagerSpecVolumesInnerRbd is not found in the empty JSON string", V1AlertmanagerSpecVolumesInnerRbd.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AlertmanagerSpecVolumesInnerRbd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AlertmanagerSpecVolumesInnerRbd` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AlertmanagerSpecVolumesInnerRbd.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("keyring") != null && !jsonObj.get("keyring").isJsonNull()) && !jsonObj.get("keyring").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyring` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyring").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("monitors") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("monitors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitors` to be an array in the JSON string but got `%s`", jsonObj.get("monitors").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1AlertmanagerSpecVolumesInnerRbdSecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AlertmanagerSpecVolumesInnerRbd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AlertmanagerSpecVolumesInnerRbd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AlertmanagerSpecVolumesInnerRbd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AlertmanagerSpecVolumesInnerRbd.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AlertmanagerSpecVolumesInnerRbd>() {
           @Override
           public void write(JsonWriter out, V1AlertmanagerSpecVolumesInnerRbd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AlertmanagerSpecVolumesInnerRbd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AlertmanagerSpecVolumesInnerRbd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AlertmanagerSpecVolumesInnerRbd
  * @throws IOException if the JSON string is invalid with respect to V1AlertmanagerSpecVolumesInnerRbd
  */
  public static V1AlertmanagerSpecVolumesInnerRbd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AlertmanagerSpecVolumesInnerRbd.class);
  }

 /**
  * Convert an instance of V1AlertmanagerSpecVolumesInnerRbd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

