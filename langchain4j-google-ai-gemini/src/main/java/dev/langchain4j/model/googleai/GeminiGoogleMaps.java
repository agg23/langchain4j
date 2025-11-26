package dev.langchain4j.model.googleai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GeminiGoogleMaps {
    private Boolean enableWidget;

    public GeminiGoogleMaps() {
    }

    public GeminiGoogleMaps(@JsonProperty("enableWidget") Boolean enableWidget) {
        this.enableWidget = enableWidget;
    }

    public static GeminiGoogleMapsBuilder builder() {
        return new GeminiGoogleMapsBuilder();
    }

    public Boolean getEnableWidget() {
        return this.enableWidget;
    }

    public void setEnableWidget(Boolean enableWidget) {
        this.enableWidget = enableWidget;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeminiGoogleMaps)) return false;
        final GeminiGoogleMaps other = (GeminiGoogleMaps) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$enableWidget = this.getEnableWidget();
        final Object other$enableWidget = other.getEnableWidget();
        if (this$enableWidget == null ? other$enableWidget != null : !this$enableWidget.equals(other$enableWidget))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeminiGoogleMaps;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $enableWidget = this.getEnableWidget();
        result = result * PRIME + ($enableWidget == null ? 43 : $enableWidget.hashCode());
        return result;
    }

    public String toString() {
        return "GeminiGoogleMaps(enableWidget=" + this.getEnableWidget() + ")";
    }

    public static class GeminiGoogleMapsBuilder {
        private Boolean enableWidget;

        GeminiGoogleMapsBuilder() {
        }

        public GeminiGoogleMapsBuilder enableWidget(Boolean enableWidget) {
            this.enableWidget = enableWidget;
            return this;
        }

        public GeminiGoogleMaps build() {
            return new GeminiGoogleMaps(this.enableWidget);
        }

        public String toString() {
            return "GeminiGoogleMaps.GeminiGoogleMapsBuilder(enableWidget=" + this.enableWidget + ")";
        }
    }
}
