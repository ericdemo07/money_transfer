package com.payments.jdbi.models;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Transaction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransaction.builder()}.
 */
@Generated(from = "Transaction", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTransaction implements Transaction {
  private final UUID id;
  private final UUID debitAccountId;
  private final UUID creditAccountId;
  private final BigDecimal amount;
  private final int transactionType;
  private final OffsetDateTime createdAt;

  private ImmutableTransaction(
      UUID id,
      UUID debitAccountId,
      UUID creditAccountId,
      BigDecimal amount,
      int transactionType,
      OffsetDateTime createdAt) {
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
  @Override
  public UUID id() {
    return id;
  }

  /**
   * @return The value of the {@code debitAccountId} attribute
   */
  @Override
  public UUID debitAccountId() {
    return debitAccountId;
  }

  /**
   * @return The value of the {@code creditAccountId} attribute
   */
  @Override
  public UUID creditAccountId() {
    return creditAccountId;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @Override
  public BigDecimal amount() {
    return amount;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @Override
  public int transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public OffsetDateTime createdAt() {
    return createdAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#id() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withId(UUID value) {
    if (this.id == value) return this;
    UUID newValue = Objects.requireNonNull(value, "id");
    return new ImmutableTransaction(
        newValue,
        this.debitAccountId,
        this.creditAccountId,
        this.amount,
        this.transactionType,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#debitAccountId() debitAccountId} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for debitAccountId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withDebitAccountId(UUID value) {
    if (this.debitAccountId == value) return this;
    UUID newValue = Objects.requireNonNull(value, "debitAccountId");
    return new ImmutableTransaction(this.id, newValue, this.creditAccountId, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#creditAccountId() creditAccountId} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for creditAccountId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withCreditAccountId(UUID value) {
    if (this.creditAccountId == value) return this;
    UUID newValue = Objects.requireNonNull(value, "creditAccountId");
    return new ImmutableTransaction(this.id, this.debitAccountId, newValue, this.amount, this.transactionType, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withAmount(BigDecimal value) {
    BigDecimal newValue = Objects.requireNonNull(value, "amount");
    if (this.amount.equals(newValue)) return this;
    return new ImmutableTransaction(
        this.id,
        this.debitAccountId,
        this.creditAccountId,
        newValue,
        this.transactionType,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#transactionType() transactionType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withTransactionType(int value) {
    if (this.transactionType == value) return this;
    return new ImmutableTransaction(this.id, this.debitAccountId, this.creditAccountId, this.amount, value, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withCreatedAt(OffsetDateTime value) {
    if (this.createdAt == value) return this;
    OffsetDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableTransaction(this.id, this.debitAccountId, this.creditAccountId, this.amount, this.transactionType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransaction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransaction
        && equalTo((ImmutableTransaction) another);
  }

  private boolean equalTo(ImmutableTransaction another) {
    return id.equals(another.id)
        && debitAccountId.equals(another.debitAccountId)
        && creditAccountId.equals(another.creditAccountId)
        && amount.equals(another.amount)
        && transactionType == another.transactionType
        && createdAt.equals(another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code debitAccountId}, {@code creditAccountId}, {@code amount}, {@code transactionType}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + debitAccountId.hashCode();
    h += (h << 5) + creditAccountId.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + transactionType;
    h += (h << 5) + createdAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Transaction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Transaction")
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
   * Creates an immutable copy of a {@link Transaction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Transaction instance
   */
  public static ImmutableTransaction copyOf(Transaction instance) {
    if (instance instanceof ImmutableTransaction) {
      return (ImmutableTransaction) instance;
    }
    return ImmutableTransaction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransaction ImmutableTransaction}.
   * <pre>
   * ImmutableTransaction.builder()
   *    .id(UUID) // required {@link Transaction#id() id}
   *    .debitAccountId(UUID) // required {@link Transaction#debitAccountId() debitAccountId}
   *    .creditAccountId(UUID) // required {@link Transaction#creditAccountId() creditAccountId}
   *    .amount(java.math.BigDecimal) // required {@link Transaction#amount() amount}
   *    .transactionType(int) // required {@link Transaction#transactionType() transactionType}
   *    .createdAt(java.time.OffsetDateTime) // required {@link Transaction#createdAt() createdAt}
   *    .build();
   * </pre>
   * @return A new ImmutableTransaction builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransaction ImmutableTransaction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Transaction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_DEBIT_ACCOUNT_ID = 0x2L;
    private static final long INIT_BIT_CREDIT_ACCOUNT_ID = 0x4L;
    private static final long INIT_BIT_AMOUNT = 0x8L;
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x10L;
    private static final long INIT_BIT_CREATED_AT = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable UUID id;
    private @Nullable UUID debitAccountId;
    private @Nullable UUID creditAccountId;
    private @Nullable BigDecimal amount;
    private int transactionType;
    private @Nullable OffsetDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Transaction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Transaction instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      debitAccountId(instance.debitAccountId());
      creditAccountId(instance.creditAccountId());
      amount(instance.amount());
      transactionType(instance.transactionType());
      createdAt(instance.createdAt());
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder id(UUID id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#debitAccountId() debitAccountId} attribute.
     * @param debitAccountId The value for debitAccountId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder debitAccountId(UUID debitAccountId) {
      this.debitAccountId = Objects.requireNonNull(debitAccountId, "debitAccountId");
      initBits &= ~INIT_BIT_DEBIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#creditAccountId() creditAccountId} attribute.
     * @param creditAccountId The value for creditAccountId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder creditAccountId(UUID creditAccountId) {
      this.creditAccountId = Objects.requireNonNull(creditAccountId, "creditAccountId");
      initBits &= ~INIT_BIT_CREDIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder amount(BigDecimal amount) {
      this.amount = Objects.requireNonNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder transactionType(int transactionType) {
      this.transactionType = transactionType;
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransaction ImmutableTransaction}.
     * @return An immutable instance of Transaction
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableTransaction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransaction(id, debitAccountId, creditAccountId, amount, transactionType, createdAt);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DEBIT_ACCOUNT_ID) != 0) attributes.add("debitAccountId");
      if ((initBits & INIT_BIT_CREDIT_ACCOUNT_ID) != 0) attributes.add("creditAccountId");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      return "Cannot build Transaction, some of required attributes are not set " + attributes;
    }
  }
}
