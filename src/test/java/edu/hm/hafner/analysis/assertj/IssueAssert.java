package edu.hm.hafner.analysis.assertj;

import java.util.Objects;
import java.util.UUID;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.description.Description;

import edu.hm.hafner.analysis.Issue;
import edu.hm.hafner.analysis.Priority;

public class IssueAssert extends AbstractAssert<IssueAssert, Issue> {
    public IssueAssert(Issue actual) {
        super(actual, IssueAssert.class);
    }

    public IssueAssert hasId(UUID id) {
        isNotNull();

        if (!Objects.equals(actual.getId(), id)) {
            failWithMessage("Expected issue's id to be <%s> but was <%s>", id, actual.getId());
        }
        return this;
    }

    public IssueAssert hasFileName(String fileName) {
        isNotNull();

        if (!Objects.equals(actual.getFileName(), fileName)) {
            failWithMessage("Expected issue's file name to be <%s> but was <%s>", fileName, actual.getId());
        }
        return this;
    }

    public IssueAssert hasCategory(String category) {
        isNotNull();

        if (!Objects.equals(actual.getCategory(), category)) {
            failWithMessage("Expected issue's category to be <%s> but was <%s>", category, actual.getId());
        }
        return this;
    }

    public IssueAssert hasType(String type) {
        isNotNull();

        if (!Objects.equals(actual.getType(), type)) {
            failWithMessage("Expected issue's type to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasPriority(Priority priority) {
        isNotNull();

        if (!Objects.equals(actual.getPriority(), priority)) {
            failWithMessage("Expected issue's priority to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasMessage(String message) {
        isNotNull();

        if (!Objects.equals(actual.getMessage(), message)) {
            failWithMessage("Expected issue's message to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasDescription(String description) {
        isNotNull();

        if (!Objects.equals(actual.getDescription(), description)) {
            failWithMessage("Expected issue's description to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasDescription(String description) {
        isNotNull();

        if (!Objects.equals(actual.getDescription(), description)) {
            failWithMessage("Expected issue's description to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasLineStart(int lineStart) {
        isNotNull();

        if (!Objects.equals(actual.getLineStart(), lineStart)) {
            failWithMessage("Expected issue's line start to be <%d> but was <%d>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasLineEnd(int lineEnd) {
        isNotNull();

        if (!Objects.equals(actual.getLineEnd(), lineEnd)) {
            failWithMessage("Expected issue's line end to be <%d> but was <%d>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasColumnStart(int columnStart) {
        isNotNull();

        if (!Objects.equals(actual.getLineStart(), columnStart)) {
            failWithMessage("Expected issue's column start to be <%d> but was <%d>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasColumnEnd(int columnEnd) {
        isNotNull();

        if (!Objects.equals(actual.getLineEnd(), columnEnd)) {
            failWithMessage("Expected issue's column end to be <%d> but was <%d>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasPackageName(String packageName) {
        isNotNull();

        if (!Objects.equals(actual.getPackageName(), packageName)) {
            failWithMessage("Expected issue's package name to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }

    public IssueAssert hasFingerprint(String fingerprint) {
        isNotNull();

        if (!Objects.equals(actual.getFingerprint(), fingerprint)) {
            failWithMessage("Expected issue's fingerprint to be <%s> but was <%s>", type, actual.getId());
        }
        return this;
    }
}
