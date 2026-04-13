
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "automaticallyGenerated",
    "captionPath",
    "fileUrl",
    "m3u8Url",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class PeerTubeCaption {

    @JsonProperty("language")
    private PeerTubeLanguage language;
    @JsonProperty("automaticallyGenerated")
    private Boolean automaticallyGenerated;
    @JsonProperty("captionPath")
    private String captionPath;
    @JsonProperty("fileUrl")
    private String fileUrl;
    @JsonProperty("m3u8Url")
    private Object m3u8Url;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("language")
    public PeerTubeLanguage getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(PeerTubeLanguage language) {
        this.language = language;
    }

    @JsonProperty("automaticallyGenerated")
    public Boolean getAutomaticallyGenerated() {
        return automaticallyGenerated;
    }

    @JsonProperty("automaticallyGenerated")
    public void setAutomaticallyGenerated(Boolean automaticallyGenerated) {
        this.automaticallyGenerated = automaticallyGenerated;
    }

    @JsonProperty("captionPath")
    public String getCaptionPath() {
        return captionPath;
    }

    @JsonProperty("captionPath")
    public void setCaptionPath(String captionPath) {
        this.captionPath = captionPath;
    }

    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @JsonProperty("m3u8Url")
    public Object getM3u8Url() {
        return m3u8Url;
    }

    @JsonProperty("m3u8Url")
    public void setM3u8Url(Object m3u8Url) {
        this.m3u8Url = m3u8Url;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "PeerTubeCaption{" +
                "language=" + language +
                ", automaticallyGenerated=" + automaticallyGenerated +
                ", captionPath='" + captionPath + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", m3u8Url=" + m3u8Url +
                ", updatedAt='" + updatedAt + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
