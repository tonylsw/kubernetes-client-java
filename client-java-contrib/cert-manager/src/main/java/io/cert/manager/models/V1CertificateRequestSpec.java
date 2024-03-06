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
import io.cert.manager.models.V1CertificateSpecIssuerRef;
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
 * Specification of the desired state of the CertificateRequest resource. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1CertificateRequestSpec {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = new HashMap<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_IS_C_A = "isCA";
  @SerializedName(SERIALIZED_NAME_IS_C_A)
  private Boolean isCA;

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";
  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1CertificateSpecIssuerRef issuerRef;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private byte[] request;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  /**
   * KeyUsage specifies valid usage contexts for keys. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12   Valid KeyUsage values are as follows: \&quot;signing\&quot;, \&quot;digital signature\&quot;, \&quot;content commitment\&quot;, \&quot;key encipherment\&quot;, \&quot;key agreement\&quot;, \&quot;data encipherment\&quot;, \&quot;cert sign\&quot;, \&quot;crl sign\&quot;, \&quot;encipher only\&quot;, \&quot;decipher only\&quot;, \&quot;any\&quot;, \&quot;server auth\&quot;, \&quot;client auth\&quot;, \&quot;code signing\&quot;, \&quot;email protection\&quot;, \&quot;s/mime\&quot;, \&quot;ipsec end system\&quot;, \&quot;ipsec tunnel\&quot;, \&quot;ipsec user\&quot;, \&quot;timestamping\&quot;, \&quot;ocsp signing\&quot;, \&quot;microsoft sgc\&quot;, \&quot;netscape sgc\&quot;
   */
  @JsonAdapter(UsagesEnum.Adapter.class)
  public enum UsagesEnum {
    SIGNING("signing"),
    
    DIGITAL_SIGNATURE("digital signature"),
    
    CONTENT_COMMITMENT("content commitment"),
    
    KEY_ENCIPHERMENT("key encipherment"),
    
    KEY_AGREEMENT("key agreement"),
    
    DATA_ENCIPHERMENT("data encipherment"),
    
    CERT_SIGN("cert sign"),
    
    CRL_SIGN("crl sign"),
    
    ENCIPHER_ONLY("encipher only"),
    
    DECIPHER_ONLY("decipher only"),
    
    ANY("any"),
    
    SERVER_AUTH("server auth"),
    
    CLIENT_AUTH("client auth"),
    
    CODE_SIGNING("code signing"),
    
    EMAIL_PROTECTION("email protection"),
    
    S_MIME("s/mime"),
    
    IPSEC_END_SYSTEM("ipsec end system"),
    
    IPSEC_TUNNEL("ipsec tunnel"),
    
    IPSEC_USER("ipsec user"),
    
    TIMESTAMPING("timestamping"),
    
    OCSP_SIGNING("ocsp signing"),
    
    MICROSOFT_SGC("microsoft sgc"),
    
    NETSCAPE_SGC("netscape sgc");

    private String value;

    UsagesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsagesEnum fromValue(String value) {
      for (UsagesEnum b : UsagesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsagesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsagesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsagesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsagesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<UsagesEnum> usages;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public V1CertificateRequestSpec() {
  }

  public V1CertificateRequestSpec duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Requested &#39;duration&#39; (i.e. lifetime) of the Certificate. Note that the issuer may choose to ignore the requested duration, just like any other requested attribute.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public V1CertificateRequestSpec extra(Map<String, List<String>> extra) {
    
    this.extra = extra;
    return this;
  }

  public V1CertificateRequestSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Extra contains extra attributes of the user that created the CertificateRequest. Populated by the cert-manager webhook on creation and immutable.
   * @return extra
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<String>> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public V1CertificateRequestSpec groups(List<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public V1CertificateRequestSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Groups contains group membership of the user that created the CertificateRequest. Populated by the cert-manager webhook on creation and immutable.
   * @return groups
  **/
  @jakarta.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public V1CertificateRequestSpec isCA(Boolean isCA) {
    
    this.isCA = isCA;
    return this;
  }

   /**
   * Requested basic constraints isCA value. Note that the issuer may choose to ignore the requested isCA value, just like any other requested attribute.   NOTE: If the CSR in the &#x60;Request&#x60; field has a BasicConstraints extension, it must have the same isCA value as specified here.   If true, this will automatically add the &#x60;cert sign&#x60; usage to the list of requested &#x60;usages&#x60;.
   * @return isCA
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsCA() {
    return isCA;
  }


  public void setIsCA(Boolean isCA) {
    this.isCA = isCA;
  }


  public V1CertificateRequestSpec issuerRef(V1CertificateSpecIssuerRef issuerRef) {
    
    this.issuerRef = issuerRef;
    return this;
  }

   /**
   * Get issuerRef
   * @return issuerRef
  **/
  @jakarta.annotation.Nonnull
  public V1CertificateSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }


  public void setIssuerRef(V1CertificateSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }


  public V1CertificateRequestSpec request(byte[] request) {
    
    this.request = request;
    return this;
  }

   /**
   * The PEM-encoded X.509 certificate signing request to be submitted to the issuer for signing.   If the CSR has a BasicConstraints extension, its isCA attribute must match the &#x60;isCA&#x60; value of this CertificateRequest. If the CSR has a KeyUsage extension, its key usages must match the key usages in the &#x60;usages&#x60; field of this CertificateRequest. If the CSR has a ExtKeyUsage extension, its extended key usages must match the extended key usages in the &#x60;usages&#x60; field of this CertificateRequest.
   * @return request
  **/
  @jakarta.annotation.Nonnull
  public byte[] getRequest() {
    return request;
  }


  public void setRequest(byte[] request) {
    this.request = request;
  }


  public V1CertificateRequestSpec uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * UID contains the uid of the user that created the CertificateRequest. Populated by the cert-manager webhook on creation and immutable.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public V1CertificateRequestSpec usages(List<UsagesEnum> usages) {
    
    this.usages = usages;
    return this;
  }

  public V1CertificateRequestSpec addUsagesItem(UsagesEnum usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * Requested key usages and extended key usages.   NOTE: If the CSR in the &#x60;Request&#x60; field has uses the KeyUsage or ExtKeyUsage extension, these extensions must have the same values as specified here without any additional values.   If unset, defaults to &#x60;digital signature&#x60; and &#x60;key encipherment&#x60;.
   * @return usages
  **/
  @jakarta.annotation.Nullable
  public List<UsagesEnum> getUsages() {
    return usages;
  }


  public void setUsages(List<UsagesEnum> usages) {
    this.usages = usages;
  }


  public V1CertificateRequestSpec username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username contains the name of the user that created the CertificateRequest. Populated by the cert-manager webhook on creation and immutable.
   * @return username
  **/
  @jakarta.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateRequestSpec v1CertificateRequestSpec = (V1CertificateRequestSpec) o;
    return Objects.equals(this.duration, v1CertificateRequestSpec.duration) &&
        Objects.equals(this.extra, v1CertificateRequestSpec.extra) &&
        Objects.equals(this.groups, v1CertificateRequestSpec.groups) &&
        Objects.equals(this.isCA, v1CertificateRequestSpec.isCA) &&
        Objects.equals(this.issuerRef, v1CertificateRequestSpec.issuerRef) &&
        Arrays.equals(this.request, v1CertificateRequestSpec.request) &&
        Objects.equals(this.uid, v1CertificateRequestSpec.uid) &&
        Objects.equals(this.usages, v1CertificateRequestSpec.usages) &&
        Objects.equals(this.username, v1CertificateRequestSpec.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, extra, groups, isCA, issuerRef, Arrays.hashCode(request), uid, usages, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateRequestSpec {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("extra");
    openapiFields.add("groups");
    openapiFields.add("isCA");
    openapiFields.add("issuerRef");
    openapiFields.add("request");
    openapiFields.add("uid");
    openapiFields.add("usages");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuerRef");
    openapiRequiredFields.add("request");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateRequestSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateRequestSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateRequestSpec is not found in the empty JSON string", V1CertificateRequestSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateRequestSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateRequestSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CertificateRequestSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      // validate the required field `issuerRef`
      V1CertificateSpecIssuerRef.validateJsonObject(jsonObj.getAsJsonObject("issuerRef"));
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateRequestSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateRequestSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateRequestSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateRequestSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateRequestSpec>() {
           @Override
           public void write(JsonWriter out, V1CertificateRequestSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateRequestSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateRequestSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateRequestSpec
  * @throws IOException if the JSON string is invalid with respect to V1CertificateRequestSpec
  */
  public static V1CertificateRequestSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateRequestSpec.class);
  }

 /**
  * Convert an instance of V1CertificateRequestSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

