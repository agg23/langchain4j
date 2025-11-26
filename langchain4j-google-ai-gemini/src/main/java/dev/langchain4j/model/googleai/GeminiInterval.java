package dev.langchain4j.model.googleai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GeminiInterval {
    private String startTime;
    private String endTime;

    public GeminiInterval() {
    }

    public GeminiInterval(@JsonProperty("startTime") String startTime, @JsonProperty("endTime") String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static GeminiIntervalBuilder builder() {
        return new GeminiIntervalBuilder();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeminiInterval)) return false;
        final GeminiInterval other = (GeminiInterval) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime))
            return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeminiInterval;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        return result;
    }

    public String toString() {
        return "GeminiInterval(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ")";
    }

    public static class GeminiIntervalBuilder {
        private String startTime;
        private String endTime;

        GeminiIntervalBuilder() {
        }

        public GeminiIntervalBuilder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public GeminiIntervalBuilder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public GeminiInterval build() {
            return new GeminiInterval(this.startTime, this.endTime);
        }

        public String toString() {
            return "GeminiInterval.GeminiIntervalBuilder(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }
    }
}
