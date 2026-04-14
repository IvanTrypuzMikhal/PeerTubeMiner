
package aiss.peertubeminer.model.peerTubeObjects;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "captionPath",
})
@Generated("jsonschema2pojo")
public class Caption {

    @JsonProperty("language")
    private Language language;
    @JsonProperty("captionPath")
    private String captionPath;

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    @JsonProperty("captionPath")
    public String getCaptionPath() {
        return captionPath;
    }

    @JsonProperty("captionPath")
    public void setCaptionPath(String captionPath) {
        this.captionPath = captionPath;
    }


    @Override
    public String toString() {
        return "PeerTubeCaption{" +
                "language=" + language +
                ", captionPath='" + captionPath + '\'' +
                '}';
    }
}
