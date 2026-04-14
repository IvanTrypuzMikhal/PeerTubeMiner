
package aiss.peertubeminer.models.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "id",
    "createdAt",
    "description"
})
@Generated("jsonschema2pojo")
public class PTChannel {

    @JsonProperty("displayName")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "PTChannel{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", createdAt='" + createdAt + '\'' +
                ", description='" + description + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
