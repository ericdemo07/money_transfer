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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

/**
 * Immutable implementation of {@link AccountModel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccountModel.builder()}.
 */
@Generated(from = "AccountModel", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableAccountModel implements AccountModel {
  private final @Nullable UUID id;
  private final @Nullable BigDecimal currentBalance;
  private final @Nullable String accountStatus;
  private final @Nullable OffsetDateTime createdAt;

  private ImmutableAccountModel(
      @Nullable UUID id,
      @Nullable BigDecimal currentBalance,
      @Nullable String accountStatus,
      @Nullable OffsetDateTime createdAt) {
    this.id = id;
    this.currentBalance = currentBalance;
    this.accountStatus = accountStatus;
    this.createdAt = createdAt;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty
  @Override
  public Optional<UUID> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code currentBalance} attribute
   */
  @JsonProperty
  @Override
  public Optional<BigDecimal> currentBalance() {
    return Optional.ofNullable(currentBalance);
  }

  /**
   * @return The value of the {@code accountStatus} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> accountStatus() {
    return Optional.ofNullable(accountStatus);
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty
  @Override
  public Optional<OffsetDateTime> createdAt() {
    return Optional.ofNullable(createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccountModel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountModel withId(UUID value) {
    @Nullable UUID newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAccountModel(newValue, this.currentBalance, this.accountStatus, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccountModel#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccountModel withId(Optional<? extends UUID> optional) {
    @Nullable UUID value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAccountModel(value, this.currentBalance, this.accountStatus, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccountModel#currentBalance() currentBalance} attribute.
   * @param value The value for currentBalance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountModel withCurrentBalance(BigDecimal value) {
    @Nullable BigDecimal newValue = Objects.requireNonNull(value, "currentBalance");
    if (Objects.equals(this.currentBalance, newValue)) return this;
    return new ImmutableAccountModel(this.id, newValue, this.accountStatus, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccountModel#currentBalance() currentBalance} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for currentBalance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccountModel withCurrentBalance(Optional<? extends BigDecimal> optional) {
    @Nullable BigDecimal value = optional.orElse(null);
    if (Objects.equals(this.currentBalance, value)) return this;
    return new ImmutableAccountModel(this.id, value, this.accountStatus, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccountModel#accountStatus() accountStatus} attribute.
   * @param value The value for accountStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountModel withAccountStatus(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "accountStatus");
    if (Objects.equals(this.accountStatus, newValue)) return this;
    return new ImmutableAccountModel(this.id, this.currentBalance, newValue, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccountModel#accountStatus() accountStatus} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accountStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountModel withAccountStatus(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.accountStatus, value)) return this;
    return new ImmutableAccountModel(this.id, this.currentBalance, value, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccountModel#createdAt() createdAt} attribute.
   * @param value The value for createdAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountModel withCreatedAt(OffsetDateTime value) {
    @Nullable OffsetDateTime newValue = Objects.requireNonNull(value, "createdAt");
    if (this.createdAt == newValue) return this;
    return new ImmutableAccountModel(this.id, this.currentBalance, this.accountStatus, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccountModel#createdAt() createdAt} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdAt
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccountModel withCreatedAt(Optional<? extends OffsetDateTime> optional) {
    @Nullable OffsetDateTime value = optional.orElse(null);
    if (this.createdAt == value) return this;
    return new ImmutableAccountModel(this.id, this.currentBalance, this.accountStatus, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccountModel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccountModel
        && equalTo((ImmutableAccountModel) another);
  }

  private boolean equalTo(ImmutableAccountModel another) {
    return Objects.equals(id, another.id)
        && Objects.equals(currentBalance, another.currentBalance)
        && Objects.equals(accountStatus, another.accountStatus)
        && Objects.equals(createdAt, another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code currentBalance}, {@code accountStatus}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(currentBalance);
    h += (h << 5) + Objects.hashCode(accountStatus);
    h += (h << 5) + Objects.hashCode(createdAt);
    return h;
  }

  /**
   * Prints the immutable value {@code AccountModel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AccountModel")
        .omitNullValues()
        .add("id", id)
        .add("currentBalance", currentBalance)
        .add("accountStatus", accountStatus)
        .add("createdAt", createdAt)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AccountModel", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AccountModel {
    @Nullable Optional<UUID> id = Optional.empty();
    @Nullable Optional<BigDecimal> currentBalance = Optional.empty();
    @Nullable Optional<String> accountStatus = Optional.empty();
    @Nullable Optional<OffsetDateTime> createdAt = Optional.empty();
    @JsonProperty
    public void setId(Optional<UUID> id) {
      this.id = id;
    }
    @JsonProperty
    public void setCurrentBalance(Optional<BigDecimal> currentBalance) {
      this.currentBalance = currentBalance;
    }
    @JsonProperty
    public void setAccountStatus(Optional<String> accountStatus) {
      this.accountStatus = accountStatus;
    }
    @JsonProperty
    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
      this.createdAt = createdAt;
    }
    @Override
    public Optional<UUID> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BigDecimal> currentBalance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> accountStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<OffsetDateTime> createdAt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccountModel fromJson(Json json) {
    Builder builder = ImmutableAccountModel.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.currentBalance != null) {
      builder.currentBalance(json.currentBalance);
    }
    if (json.accountStatus != null) {
      builder.accountStatus(json.accountStatus);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccountModel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccountModel instance
   */
  public static ImmutableAccountModel copyOf(AccountModel instance) {
    if (instance instanceof ImmutableAccountModel) {
      return (ImmutableAccountModel) instance;
    }
    return ImmutableAccountModel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccountModel ImmutableAccountModel}.
   * <pre>
   * ImmutableAccountModel.builder()
   *    .id(UUID) // optional {@link AccountModel#id() id}
   *    .currentBalance(java.math.BigDecimal) // optional {@link AccountModel#currentBalance() currentBalance}
   *    .accountStatus(String) // optional {@link AccountModel#accountStatus() accountStatus}
   *    .createdAt(java.time.OffsetDateTime) // optional {@link AccountModel#createdAt() createdAt}
   *    .build();
   * </pre>
   * @return A new ImmutableAccountModel builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccountModel ImmutableAccountModel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccountModel", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private @Nullable UUID id;
    private @Nullable BigDecimal currentBalance;
    private @Nullable String accountStatus;
    private @Nullable OffsetDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccountModel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder from(AccountModel instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<UUID> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      Optional<BigDecimal> currentBalanceOptional = instance.currentBalance();
      if (currentBalanceOptional.isPresent()) {
        currentBalance(currentBalanceOptional);
      }
      Optional<String> accountStatusOptional = instance.accountStatus();
      if (accountStatusOptional.isPresent()) {
        accountStatus(accountStatusOptional);
      }
      Optional<OffsetDateTime> createdAtOptional = instance.createdAt();
      if (createdAtOptional.isPresent()) {
        createdAt(createdAtOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder id(UUID id) {
      this.id = Objects.requireNonNull(id, "id");
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder id(Optional<? extends UUID> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#currentBalance() currentBalance} to currentBalance.
     * @param currentBalance The value for currentBalance
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder currentBalance(BigDecimal currentBalance) {
      this.currentBalance = Objects.requireNonNull(currentBalance, "currentBalance");
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#currentBalance() currentBalance} to currentBalance.
     * @param currentBalance The value for currentBalance
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder currentBalance(Optional<? extends BigDecimal> currentBalance) {
      this.currentBalance = currentBalance.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#accountStatus() accountStatus} to accountStatus.
     * @param accountStatus The value for accountStatus
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder accountStatus(String accountStatus) {
      this.accountStatus = Objects.requireNonNull(accountStatus, "accountStatus");
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#accountStatus() accountStatus} to accountStatus.
     * @param accountStatus The value for accountStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder accountStatus(Optional<String> accountStatus) {
      this.accountStatus = accountStatus.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#createdAt() createdAt} to createdAt.
     * @param createdAt The value for createdAt
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Initializes the optional value {@link AccountModel#createdAt() createdAt} to createdAt.
     * @param createdAt The value for createdAt
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
      this.createdAt = createdAt.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccountModel ImmutableAccountModel}.
     * @return An immutable instance of AccountModel
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableAccountModel build() {
      return new ImmutableAccountModel(id, currentBalance, accountStatus, createdAt);
    }
  }
}
