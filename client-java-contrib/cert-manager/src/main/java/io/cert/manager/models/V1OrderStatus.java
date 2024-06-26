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
import io.cert.manager.models.V1OrderStatusAuthorizationsInner;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * V1OrderStatus
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1OrderStatus {
  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private List<V1OrderStatusAuthorizationsInner> authorizations;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_FAILURE_TIME = "failureTime";
  @SerializedName(SERIALIZED_NAME_FAILURE_TIME)
  private OffsetDateTime failureTime;

  public static final String SERIALIZED_NAME_FINALIZE_U_R_L = "finalizeURL";
  @SerializedName(SERIALIZED_NAME_FINALIZE_U_R_L)
  private String finalizeURL;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * State contains the current state of this Order resource. States &#39;success&#39; and &#39;expired&#39; are &#39;final&#39;
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

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1OrderStatus() {
  }

  public V1OrderStatus authorizations(List<V1OrderStatusAuthorizationsInner> authorizations) {
    
    this.authorizations = authorizations;
    return this;
  }

  public V1OrderStatus addAuthorizationsItem(V1OrderStatusAuthorizationsInner authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

   /**
   * Authorizations contains data returned from the ACME server on what authorizations must be completed in order to validate the DNS names specified on the Order.
   * @return authorizations
  **/
  @jakarta.annotation.Nullable
  public List<V1OrderStatusAuthorizationsInner> getAuthorizations() {
    return authorizations;
  }


  public void setAuthorizations(List<V1OrderStatusAuthorizationsInner> authorizations) {
    this.authorizations = authorizations;
  }


  public V1OrderStatus certificate(byte[] certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Certificate is a copy of the PEM encoded certificate for this Order. This field will be populated after the order has been successfully finalized with the ACME server, and the order has transitioned to the &#39;valid&#39; state.
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  public byte[] getCertificate() {
    return certificate;
  }


  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }


  public V1OrderStatus failureTime(OffsetDateTime failureTime) {
    
    this.failureTime = failureTime;
    return this;
  }

   /**
   * FailureTime stores the time that this order failed. This is used to influence garbage collection and back-off.
   * @return failureTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getFailureTime() {
    return failureTime;
  }


  public void setFailureTime(OffsetDateTime failureTime) {
    this.failureTime = failureTime;
  }


  public V1OrderStatus finalizeURL(String finalizeURL) {
    
    this.finalizeURL = finalizeURL;
    return this;
  }

   /**
   * FinalizeURL of the Order. This is used to obtain certificates for this order once it has been completed.
   * @return finalizeURL
  **/
  @jakarta.annotation.Nullable
  public String getFinalizeURL() {
    return finalizeURL;
  }


  public void setFinalizeURL(String finalizeURL) {
    this.finalizeURL = finalizeURL;
  }


  public V1OrderStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason optionally provides more information about a why the order is in the current state.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1OrderStatus state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State contains the current state of this Order resource. States &#39;success&#39; and &#39;expired&#39; are &#39;final&#39;
   * @return state
  **/
  @jakarta.annotation.Nullable
  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public V1OrderStatus url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the Order. This will initially be empty when the resource is first created. The Order controller will populate this field when the Order is first processed. This field will be immutable after it is initially set.
   * @return url
  **/
  @jakarta.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OrderStatus v1OrderStatus = (V1OrderStatus) o;
    return Objects.equals(this.authorizations, v1OrderStatus.authorizations) &&
        Arrays.equals(this.certificate, v1OrderStatus.certificate) &&
        Objects.equals(this.failureTime, v1OrderStatus.failureTime) &&
        Objects.equals(this.finalizeURL, v1OrderStatus.finalizeURL) &&
        Objects.equals(this.reason, v1OrderStatus.reason) &&
        Objects.equals(this.state, v1OrderStatus.state) &&
        Objects.equals(this.url, v1OrderStatus.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizations, Arrays.hashCode(certificate), failureTime, finalizeURL, reason, state, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OrderStatus {\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    failureTime: ").append(toIndentedString(failureTime)).append("\n");
    sb.append("    finalizeURL: ").append(toIndentedString(finalizeURL)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("authorizations");
    openapiFields.add("certificate");
    openapiFields.add("failureTime");
    openapiFields.add("finalizeURL");
    openapiFields.add("reason");
    openapiFields.add("state");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1OrderStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1OrderStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1OrderStatus is not found in the empty JSON string", V1OrderStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1OrderStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1OrderStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("authorizations") != null && !jsonObj.get("authorizations").isJsonNull()) {
        JsonArray jsonArrayauthorizations = jsonObj.getAsJsonArray("authorizations");
        if (jsonArrayauthorizations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authorizations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authorizations` to be an array in the JSON string but got `%s`", jsonObj.get("authorizations").toString()));
          }

          // validate the optional field `authorizations` (array)
          for (int i = 0; i < jsonArrayauthorizations.size(); i++) {
            V1OrderStatusAuthorizationsInner.validateJsonObject(jsonArrayauthorizations.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("finalizeURL") != null && !jsonObj.get("finalizeURL").isJsonNull()) && !jsonObj.get("finalizeURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finalizeURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finalizeURL").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1OrderStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1OrderStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1OrderStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1OrderStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1OrderStatus>() {
           @Override
           public void write(JsonWriter out, V1OrderStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1OrderStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1OrderStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1OrderStatus
  * @throws IOException if the JSON string is invalid with respect to V1OrderStatus
  */
  public static V1OrderStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1OrderStatus.class);
  }

 /**
  * Convert an instance of V1OrderStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

