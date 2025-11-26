package dev.langchain4j.model.googleai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GeminiGoogleSearch {
    private GeminiInterval timeRangeFilter;

    public GeminiGoogleSearch() {
    }

    public GeminiGoogleSearch(@JsonProperty("timeRangeFilter") GeminiInterval timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    public static GeminiGoogleSearchBuilder builder() {
        return new GeminiGoogleSearchBuilder();
    }

    public GeminiInterval getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    public void setTimeRangeFilter(GeminiInterval timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeminiGoogleSearch)) return false;
        final GeminiGoogleSearch other = (GeminiGoogleSearch) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timeRangeFilter = this.getTimeRangeFilter();
        final Object other$timeRangeFilter = other.getTimeRangeFilter();
        if (this$timeRangeFilter == null ? other$timeRangeFilter != null : !this$timeRangeFilter.equals(other$timeRangeFilter))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeminiGoogleSearch;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timeRangeFilter = this.getTimeRangeFilter();
        result = result * PRIME + ($timeRangeFilter == null ? 43 : $timeRangeFilter.hashCode());
        return result;
    }

    public String toString() {
        return "GeminiGoogleSearch(timeRangeFilter=" + this.getTimeRangeFilter() + ")";
    }

    public static class GeminiGoogleSearchBuilder {
        private GeminiInterval timeRangeFilter;

        GeminiGoogleSearchBuilder() {
        }

        public GeminiGoogleSearchBuilder timeRangeFilter(GeminiInterval timeRangeFilter) {
            this.timeRangeFilter = timeRangeFilter;
            return this;
        }

        public GeminiGoogleSearch build() {
            return new GeminiGoogleSearch(this.timeRangeFilter);
        }

        public String toString() {
            return "GeminiGoogleSearch.GeminiGoogleSearchBuilder(timeRangeFilter=" + this.timeRangeFilter + ")";
        }
    }
}
