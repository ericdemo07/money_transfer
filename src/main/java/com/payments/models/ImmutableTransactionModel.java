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
 * Immutable implementation of {@link TransactionModel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionModel.builder()}.
 */
@Generated(from = "TransactionModel", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTransactionModel implements TransactionModel {
  private final @Nullable UUID id;
  private final @Nullable UUID debitAccountId;
  private final @Nullable UUID creditAccountId;
  private final @Nullable BigDecimal amount;
  private final @Nullable String transactionType;
  private final @Nullable OffsetDateTime createdAt;

  private ImmutableTransactionModel(
      @Nullable UUID id,
      @Nullable UUID debitAccountId,
      @Nullable UUID creditAccountId,
      @Nullable BigDecimal amount,
      @Nullable String transactionType,
      @Nullable OffsetDateTime createdAt) {
    this.id = id;
    this.debitAccountId = debitAccountId;
    this.creditAccountId = creditAccountId;
    this.amount = amount;
    this.transactionType = transactionType;
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
   * @return The value of the {@code debitAccountId} attribute
   */
  @JsonProperty
  @Override
  public Optional<UUID> debitAccountId() {
    return Optional.ofNullable(debitAccountId);
  }

  /**
   * @return The value of the {@code creditAccountId} attribute
   */
  @JsonProperty
  @Override
  public Optional<UUID> creditAccountId() {
    return Optional.ofNullable(creditAccountId);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty
  @Override
  public Optional<BigDecimal> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> transactionType() {
    return Optional.ofNullable(transactionType);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withId(UUID value) {
    @Nullable UUID newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTransactionModel(
        newValue,
        this.debitAccountId,
        this.creditAccountId,
        this.amount,
        this.transactionType,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTransactionModel withId(Optional<? extends UUID> optional) {
    @Nullable UUID value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTransactionModel(
        value,
        this.debitAccountId,
        this.creditAccountId,
        this.amount,
        this.transactionType,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#debitAccountId() debitAccountId} attribute.
   * @param value The value for debitAccountId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withDebitAccountId(UUID value) {
    @Nullable UUID newValue = Objects.requireNonNull(value, "debitAccountId");
    if (this.debitAccountId == newValue) return this;
    return new ImmutableTransactionModel(this.id, newValue, this.creditAccountId, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#debitAccountId() debitAccountId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for debitAccountId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTransactionModel withDebitAccountId(Optional<? extends UUID> optional) {
    @Nullable UUID value = optional.orElse(null);
    if (this.debitAccountId == value) return this;
    return new ImmutableTransactionModel(this.id, value, this.creditAccountId, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#creditAccountId() creditAccountId} attribute.
   * @param value The value for creditAccountId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withCreditAccountId(UUID value) {
    @Nullable UUID newValue = Objects.requireNonNull(value, "creditAccountId");
    if (this.creditAccountId == newValue) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, newValue, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#creditAccountId() creditAccountId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for creditAccountId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTransactionModel withCreditAccountId(Optional<? extends UUID> optional) {
    @Nullable UUID value = optional.orElse(null);
    if (this.creditAccountId == value) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, value, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withAmount(BigDecimal value) {
    @Nullable BigDecimal newValue = Objects.requireNonNull(value, "amount");
    if (Objects.equals(this.amount, newValue)) return this;
    return new ImmutableTransactionModel(
        this.id,
        this.debitAccountId,
        this.creditAccountId,
        newValue,
        this.transactionType,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#amount() amount} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTransactionModel withAmount(Optional<? extends BigDecimal> optional) {
    @Nullable BigDecimal value = optional.orElse(null);
    if (Objects.equals(this.amount, value)) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, this.creditAccountId, value, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#transactionType() transactionType} attribute.
   * @param value The value for transactionType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withTransactionType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "transactionType");
    if (Objects.equals(this.transactionType, newValue)) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, this.creditAccountId, this.amount, newValue, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#transactionType() transactionType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transactionType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withTransactionType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.transactionType, value)) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, this.creditAccountId, this.amount, value, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TransactionModel#createdAt() createdAt} attribute.
   * @param value The value for createdAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionModel withCreatedAt(OffsetDateTime value) {
    @Nullable OffsetDateTime newValue = Objects.requireNonNull(value, "createdAt");
    if (this.createdAt == newValue) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, this.creditAccountId, this.amount, this.transactionType, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TransactionModel#createdAt() createdAt} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdAt
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTransactionModel withCreatedAt(Optional<? extends OffsetDateTime> optional) {
    @Nullable OffsetDateTime value = optional.orElse(null);
    if (this.createdAt == value) return this;
    return new ImmutableTransactionModel(this.id, this.debitAccountId, this.creditAccountId, this.amount, this.transactionType, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionModel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionModel
        && equalTo((ImmutableTransactionModel) another);
  }

  private boolean equalTo(ImmutableTransactionModel another) {
    return Objects.equals(id, another.id)
        && Objects.equals(debitAccountId, another.debitAccountId)
        && Objects.equals(creditAccountId, another.creditAccountId)
        && Objects.equals(amount, another.amount)
        && Objects.equals(transactionType, another.transactionType)
        && Objects.equals(createdAt, another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code debitAccountId}, {@code creditAccountId}, {@code amount}, {@code transactionType}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(debitAccountId);
    h += (h << 5) + Objects.hashCode(creditAccountId);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(transactionType);
    h += (h << 5) + Objects.hashCode(createdAt);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionModel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionModel")
        .omitNullValues()
        .add("id", id)
        .add("debitAccountId", debitAccountId)
        .add("creditAccountId", creditAccountId)
        .add("amount", amount)
        .add("transactionType", transactionType)
        .add("createdAt", createdAt)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TransactionModel", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionModel {
    @Nullable Optional<UUID> id = Optional.empty();
    @Nullable Optional<UUID> debitAccountId = Optional.empty();
    @Nullable Optional<UUID> creditAccountId = Optional.empty();
    @Nullable Optional<BigDecimal> amount = Optional.empty();
    @Nullable Optional<String> transactionType = Optional.empty();
    @Nullable Optional<OffsetDateTime> createdAt = Optional.empty();
    @JsonProperty
    public void setId(Optional<UUID> id) {
      this.id = id;
    }
    @JsonProperty
    public void setDebitAccountId(Optional<UUID> debitAccountId) {
      this.debitAccountId = debitAccountId;
    }
    @JsonProperty
    public void setCreditAccountId(Optional<UUID> creditAccountId) {
      this.creditAccountId = creditAccountId;
    }
    @JsonProperty
    public void setAmount(Optional<BigDecimal> amount) {
      this.amount = amount;
    }
    @JsonProperty
    public void setTransactionType(Optional<String> transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty
    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
      this.createdAt = createdAt;
    }
    @Override
    public Optional<UUID> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UUID> debitAccountId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UUID> creditAccountId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BigDecimal> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> transactionType() { throw new UnsupportedOperationException(); }
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
  static ImmutableTransactionModel fromJson(Json json) {
    Builder builder = ImmutableTransactionModel.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.debitAccountId != null) {
      builder.debitAccountId(json.debitAccountId);
    }
    if (json.creditAccountId != null) {
      builder.creditAccountId(json.creditAccountId);
    }
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionModel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionModel instance
   */
  public static ImmutableTransactionModel copyOf(TransactionModel instance) {
    if (instance instanceof ImmutableTransactionModel) {
      return (ImmutableTransactionModel) instance;
    }
    return ImmutableTransactionModel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionModel ImmutableTransactionModel}.
   * <pre>
   * ImmutableTransactionModel.builder()
   *    .id(UUID) // optional {@link TransactionModel#id() id}
   *    .debitAccountId(UUID) // optional {@link TransactionModel#debitAccountId() debitAccountId}
   *    .creditAccountId(UUID) // optional {@link TransactionModel#creditAccountId() creditAccountId}
   *    .amount(java.math.BigDecimal) // optional {@link TransactionModel#amount() amount}
   *    .transactionType(String) // optional {@link TransactionModel#transactionType() transactionType}
   *    .createdAt(java.time.OffsetDateTime) // optional {@link TransactionModel#createdAt() createdAt}
   *    .build();
   * </pre>
   * @return A new ImmutableTransactionModel builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionModel ImmutableTransactionModel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TransactionModel", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private @Nullable UUID id;
    private @Nullable UUID debitAccountId;
    private @Nullable UUID creditAccountId;
    private @Nullable BigDecimal amount;
    private @Nullable String transactionType;
    private @Nullable OffsetDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionModel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder from(TransactionModel instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<UUID> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      Optional<UUID> debitAccountIdOptional = instance.debitAccountId();
      if (debitAccountIdOptional.isPresent()) {
        debitAccountId(debitAccountIdOptional);
      }
      Optional<UUID> creditAccountIdOptional = instance.creditAccountId();
      if (creditAccountIdOptional.isPresent()) {
        creditAccountId(creditAccountIdOptional);
      }
      Optional<BigDecimal> amountOptional = instance.amount();
      if (amountOptional.isPresent()) {
        amount(amountOptional);
      }
      Optional<String> transactionTypeOptional = instance.transactionType();
      if (transactionTypeOptional.isPresent()) {
        transactionType(transactionTypeOptional);
      }
      Optional<OffsetDateTime> createdAtOptional = instance.createdAt();
      if (createdAtOptional.isPresent()) {
        createdAt(createdAtOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder id(UUID id) {
      this.id = Objects.requireNonNull(id, "id");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#id() id} to id.
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
     * Initializes the optional value {@link TransactionModel#debitAccountId() debitAccountId} to debitAccountId.
     * @param debitAccountId The value for debitAccountId
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder debitAccountId(UUID debitAccountId) {
      this.debitAccountId = Objects.requireNonNull(debitAccountId, "debitAccountId");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#debitAccountId() debitAccountId} to debitAccountId.
     * @param debitAccountId The value for debitAccountId
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder debitAccountId(Optional<? extends UUID> debitAccountId) {
      this.debitAccountId = debitAccountId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#creditAccountId() creditAccountId} to creditAccountId.
     * @param creditAccountId The value for creditAccountId
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder creditAccountId(UUID creditAccountId) {
      this.creditAccountId = Objects.requireNonNull(creditAccountId, "creditAccountId");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#creditAccountId() creditAccountId} to creditAccountId.
     * @param creditAccountId The value for creditAccountId
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder creditAccountId(Optional<? extends UUID> creditAccountId) {
      this.creditAccountId = creditAccountId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder amount(BigDecimal amount) {
      this.amount = Objects.requireNonNull(amount, "amount");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder amount(Optional<? extends BigDecimal> amount) {
      this.amount = amount.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#transactionType() transactionType} to transactionType.
     * @param transactionType The value for transactionType
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder transactionType(String transactionType) {
      this.transactionType = Objects.requireNonNull(transactionType, "transactionType");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#transactionType() transactionType} to transactionType.
     * @param transactionType The value for transactionType
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    @JsonProperty
    public final Builder transactionType(Optional<String> transactionType) {
      this.transactionType = transactionType.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#createdAt() createdAt} to createdAt.
     * @param createdAt The value for createdAt
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Initializes the optional value {@link TransactionModel#createdAt() createdAt} to createdAt.
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
     * Builds a new {@link ImmutableTransactionModel ImmutableTransactionModel}.
     * @return An immutable instance of TransactionModel
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionModel build() {
      return new ImmutableTransactionModel(id, debitAccountId, creditAccountId, amount, transactionType, createdAt);
    }
  }
}
