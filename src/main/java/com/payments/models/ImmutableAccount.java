package com.payments.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.primitives.Doubles;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Account}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccount.builder()}.
 */
@Generated(from = "Account", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableAccount implements Account {
    private final @Nullable UUID id;
    private final double currentBalance;
    private final int accountStatus;
    private final @Nullable OffsetDateTime createdAt;

    private ImmutableAccount(
            @Nullable UUID id,
            double currentBalance,
            int accountStatus,
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
    public double currentBalance() {
        return currentBalance;
    }

    /**
     * @return The value of the {@code accountStatus} attribute
     */
    @JsonProperty
    @Override
    public int accountStatus() {
        return accountStatus;
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
     * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#id() id} attribute.
     * @param value The value for id
     * @return A modified copy of {@code this} object
     */
    public final ImmutableAccount withId(UUID value) {
        @Nullable UUID newValue = Objects.requireNonNull(value, "id");
        if (this.id == newValue) return this;
        return new ImmutableAccount(newValue, this.currentBalance, this.accountStatus, this.createdAt);
    }

    /**
     * Copy the current immutable object by setting an optional value for the {@link Account#id() id} attribute.
     * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
     * @param optional A value for id
     * @return A modified copy of {@code this} object
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final ImmutableAccount withId(Optional<? extends UUID> optional) {
        @Nullable UUID value = optional.orElse(null);
        if (this.id == value) return this;
        return new ImmutableAccount(value, this.currentBalance, this.accountStatus, this.createdAt);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link Account#currentBalance() currentBalance} attribute.
     * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for currentBalance
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableAccount withCurrentBalance(double value) {
        if (Double.doubleToLongBits(this.currentBalance) == Double.doubleToLongBits(value)) return this;
        return new ImmutableAccount(this.id, value, this.accountStatus, this.createdAt);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link Account#accountStatus() accountStatus} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for accountStatus
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableAccount withAccountStatus(int value) {
        if (this.accountStatus == value) return this;
        return new ImmutableAccount(this.id, this.currentBalance, value, this.createdAt);
    }

    /**
     * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#createdAt() createdAt} attribute.
     * @param value The value for createdAt
     * @return A modified copy of {@code this} object
     */
    public final ImmutableAccount withCreatedAt(OffsetDateTime value) {
        @Nullable OffsetDateTime newValue = Objects.requireNonNull(value, "createdAt");
        if (this.createdAt == newValue) return this;
        return new ImmutableAccount(this.id, this.currentBalance, this.accountStatus, newValue);
    }

    /**
     * Copy the current immutable object by setting an optional value for the {@link Account#createdAt() createdAt} attribute.
     * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
     * @param optional A value for createdAt
     * @return A modified copy of {@code this} object
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final ImmutableAccount withCreatedAt(Optional<? extends OffsetDateTime> optional) {
        @Nullable OffsetDateTime value = optional.orElse(null);
        if (this.createdAt == value) return this;
        return new ImmutableAccount(this.id, this.currentBalance, this.accountStatus, value);
    }

    /**
     * This instance is equal to all instances of {@code ImmutableAccount} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
        if (this == another) return true;
        return another instanceof ImmutableAccount
                && equalTo((ImmutableAccount) another);
    }

    private boolean equalTo(ImmutableAccount another) {
        return Objects.equals(id, another.id)
                && Double.doubleToLongBits(currentBalance) == Double.doubleToLongBits(another.currentBalance)
                && accountStatus == another.accountStatus
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
        h += (h << 5) + Doubles.hashCode(currentBalance);
        h += (h << 5) + accountStatus;
        h += (h << 5) + Objects.hashCode(createdAt);
        return h;
    }

    /**
     * Prints the immutable value {@code Account} with attribute values.
     * @return A string representation of the value
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper("Account")
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
    @Generated(from = "Account", generator = "Immutables")
    @Deprecated
    @SuppressWarnings("Immutable")
    @JsonDeserialize
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    static final class Json implements Account {
        @Nullable Optional<UUID> id = Optional.empty();
        double currentBalance;
        boolean currentBalanceIsSet;
        int accountStatus;
        boolean accountStatusIsSet;
        @Nullable Optional<OffsetDateTime> createdAt = Optional.empty();
        @JsonProperty
        public void setId(Optional<UUID> id) {
            this.id = id;
        }
        @JsonProperty
        public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
            this.currentBalanceIsSet = true;
        }
        @JsonProperty
        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
            this.accountStatusIsSet = true;
        }
        @JsonProperty
        public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
        }
        @Override
        public Optional<UUID> id() { throw new UnsupportedOperationException(); }
        @Override
        public double currentBalance() { throw new UnsupportedOperationException(); }
        @Override
        public int accountStatus() { throw new UnsupportedOperationException(); }
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
    static ImmutableAccount fromJson(Json json) {
        ImmutableAccount.Builder builder = ImmutableAccount.builder();
        if (json.id != null) {
            builder.id(json.id);
        }
        if (json.currentBalanceIsSet) {
            builder.currentBalance(json.currentBalance);
        }
        if (json.accountStatusIsSet) {
            builder.accountStatus(json.accountStatus);
        }
        if (json.createdAt != null) {
            builder.createdAt(json.createdAt);
        }
        return builder.build();
    }

    /**
     * Creates an immutable copy of a {@link Account} value.
     * Uses accessors to get values to initialize the new immutable instance.
     * If an instance is already immutable, it is returned as is.
     * @param instance The instance to copy
     * @return A copied immutable Account instance
     */
    public static ImmutableAccount copyOf(Account instance) {
        if (instance instanceof ImmutableAccount) {
            return (ImmutableAccount) instance;
        }
        return ImmutableAccount.builder()
                .from(instance)
                .build();
    }

    /**
     * Creates a builder for {@link ImmutableAccount ImmutableAccount}.
     * <pre>
     * ImmutableAccount.builder()
     *    .id(UUID) // optional {@link Account#id() id}
     *    .currentBalance(double) // required {@link Account#currentBalance() currentBalance}
     *    .accountStatus(int) // required {@link Account#accountStatus() accountStatus}
     *    .createdAt(java.time.OffsetDateTime) // optional {@link Account#createdAt() createdAt}
     *    .build();
     * </pre>
     * @return A new ImmutableAccount builder
     */
    public static ImmutableAccount.Builder builder() {
        return new ImmutableAccount.Builder();
    }

    /**
     * Builds instances of type {@link ImmutableAccount ImmutableAccount}.
     * Initialize attributes and then invoke the {@link #build()} method to create an
     * immutable instance.
     * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
     * but instead used immediately to create instances.</em>
     */
    @Generated(from = "Account", generator = "Immutables")
    @NotThreadSafe
    public static final class Builder {
        private static final long INIT_BIT_CURRENT_BALANCE = 0x1L;
        private static final long INIT_BIT_ACCOUNT_STATUS = 0x2L;
        private long initBits = 0x3L;

        private @Nullable UUID id;
        private double currentBalance;
        private int accountStatus;
        private @Nullable OffsetDateTime createdAt;

        private Builder() {
        }

        /**
         * Fill a builder with attribute values from the provided {@code Account} instance.
         * Regular attribute values will be replaced with those from the given instance.
         * Absent optional values will not replace present values.
         * @param instance The instance from which to copy values
         * @return {@code this} builder for use in a chained invocation
         */
        @CanIgnoreReturnValue
        public final Builder from(Account instance) {
            Objects.requireNonNull(instance, "instance");
            Optional<UUID> idOptional = instance.id();
            if (idOptional.isPresent()) {
                id(idOptional);
            }
            currentBalance(instance.currentBalance());
            accountStatus(instance.accountStatus());
            Optional<OffsetDateTime> createdAtOptional = instance.createdAt();
            if (createdAtOptional.isPresent()) {
                createdAt(createdAtOptional);
            }
            return this;
        }

        /**
         * Initializes the optional value {@link Account#id() id} to id.
         * @param id The value for id
         * @return {@code this} builder for chained invocation
         */
        @CanIgnoreReturnValue
        public final Builder id(UUID id) {
            this.id = Objects.requireNonNull(id, "id");
            return this;
        }

        /**
         * Initializes the optional value {@link Account#id() id} to id.
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
         * Initializes the value for the {@link Account#currentBalance() currentBalance} attribute.
         * @param currentBalance The value for currentBalance
         * @return {@code this} builder for use in a chained invocation
         */
        @CanIgnoreReturnValue
        @JsonProperty
        public final Builder currentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
            initBits &= ~INIT_BIT_CURRENT_BALANCE;
            return this;
        }

        /**
         * Initializes the value for the {@link Account#accountStatus() accountStatus} attribute.
         * @param accountStatus The value for accountStatus
         * @return {@code this} builder for use in a chained invocation
         */
        @CanIgnoreReturnValue
        @JsonProperty
        public final Builder accountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
            initBits &= ~INIT_BIT_ACCOUNT_STATUS;
            return this;
        }

        /**
         * Initializes the optional value {@link Account#createdAt() createdAt} to createdAt.
         * @param createdAt The value for createdAt
         * @return {@code this} builder for chained invocation
         */
        @CanIgnoreReturnValue
        public final Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
            return this;
        }

        /**
         * Initializes the optional value {@link Account#createdAt() createdAt} to createdAt.
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
         * Builds a new {@link ImmutableAccount ImmutableAccount}.
         * @return An immutable instance of Account
         * @throws java.lang.IllegalStateException if any required attributes are missing
         */
        public ImmutableAccount build() {
            if (initBits != 0) {
                throw new IllegalStateException(formatRequiredAttributesMessage());
            }
            return new ImmutableAccount(id, currentBalance, accountStatus, createdAt);
        }

        private String formatRequiredAttributesMessage() {
            List<String> attributes = new ArrayList<>();
            if ((initBits & INIT_BIT_CURRENT_BALANCE) != 0) attributes.add("currentBalance");
            if ((initBits & INIT_BIT_ACCOUNT_STATUS) != 0) attributes.add("accountStatus");
            return "Cannot build Account, some of required attributes are not set " + attributes;
        }
    }
}
