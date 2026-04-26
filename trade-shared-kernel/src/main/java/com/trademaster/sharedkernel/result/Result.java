package com.trademaster.sharedkernel.result;

import java.util.Objects;
import java.util.Optional;

public sealed interface Result<T> permits Result.Ok, Result.Err {
  boolean isOk();

  default boolean isErr() {
    return !isOk();
  }

  Optional<T> value();

  Optional<Error> error();

  static <T> Ok<T> ok(T value) {
    return new Ok<>(value);
  }

  static <T> Err<T> err(Error error) {
    return new Err<>(error);
  }

  record Ok<T>(T okValue) implements Result<T> {
    public Ok {
      Objects.requireNonNull(okValue, "value");
    }

    @Override
    public boolean isOk() {
      return true;
    }

    @Override
    public Optional<T> value() {
      return Optional.of(okValue);
    }

    @Override
    public Optional<Error> error() {
      return Optional.empty();
    }
  }

  record Err<T>(Error errError) implements Result<T> {
    public Err {
      Objects.requireNonNull(errError, "error");
    }

    @Override
    public boolean isOk() {
      return false;
    }

    @Override
    public Optional<T> value() {
      return Optional.empty();
    }

    @Override
    public Optional<Error> error() {
      return Optional.of(errError);
    }
  }
}
