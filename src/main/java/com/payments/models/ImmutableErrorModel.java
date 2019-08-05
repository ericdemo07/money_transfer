package com.payments.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import org.immutables.value.Generated;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Immutable implementation of {@link ErrorModel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorModel.builder()}.
 */
@Generated(from = "ErrorModel", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableErrorModel implements ErrorModel {
  private final String error;

  private ImmutableErrorModel(String error) {
    this.error = error;
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty
  @Override
  public String error() {
    return error;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorModel#error() error} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for error
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorModel withError(String value) {
    String newValue = Objects.requireNonNull(value, "error");
    if (this.error.equals(newValue)) return this;
    return new ImmutableErrorModel(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorModel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorModel
        && equalTo((ImmutableErrorModel) another);
  }

  private boolean equalTo(ImmutableErrorModel another) {
    return error.equals(another.error);
  }

  /**
   * Computes a hash code from attributes: {@code error}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + error.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorModel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorModel")
        .omitNullValues()
        .add("error", error)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ErrorModel", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ErrorModel {
    @Nullable String error;
    @JsonProperty
    public void setError(String error) {
      this.error = error;
    }
    @Override
    public String error() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorModel fromJson(Json json) {
    ImmutableErrorModel.Builder builder = ImmutableErrorModel.builder();
    if (json.error != null) {
      builder.error(json.error);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ErrorModel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorModel instance
   */
  public static ImmutableErrorModel copyOf(ErrorModel instance) {
    if (instance instanceof ImmutableErrorModel) {
      return (ImmutableErrorModel) instance;
    }
    return ImmutableErrorModel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorModel ImmutableErrorModel}.
   * <pre>
   * ImmutableErrorModel.builder()
   *    .error(String) // required {@link ErrorModel#error() error}
   *    .build();
   * </pre>
   * @return A new ImmutableErrorModel builder
   */
  public static ImmutableErrorModel.Builder builder() {
    return new ImmutableErrorModel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorModel ImmutableErrorModel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ErrorModel", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ERROR = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String error;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorModel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder from(ErrorModel instance) {
      Objects.requireNonNull(instance, "instance");
      error(instance.error());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorModel#error() error} attribute.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder error(String error) {
      this.error = Objects.requireNonNull(error, "error");
      initBits &= ~INIT_BIT_ERROR;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorModel ImmutableErrorModel}.
     * @return An immutable instance of ErrorModel
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorModel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorModel(error);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ERROR) != 0) attributes.add("error");
      return "Cannot build ErrorModel, some of required attributes are not set " + attributes;
    }
  }
}
