// Autogenerated code. Do not modify.
package org.inferred.freebuilder.processor;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.inferred.freebuilder.processor.BuilderFactory;
import org.inferred.freebuilder.processor.Metadata;
import org.inferred.freebuilder.processor.util.ParameterizedType;

/**
 * Auto-generated superclass of {@link Metadata.Builder},
 * derived from the API of {@link Metadata}.
 */
@Generated("org.inferred.freebuilder.processor.CodeGenerator")
abstract class Metadata_Builder {

  private static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();

  private enum Property {
    GENERATED_BUILDER("generatedBuilder"),
    PARTIAL_TYPE("partialType"),
    PROPERTY_ENUM("propertyEnum"),
    TYPE("type"),
    VALUE_TYPE("valueType"),
    BUILDER_SERIALIZABLE("builderSerializable"),
    GWT_COMPATIBLE("gwtCompatible"),
    GWT_SERIALIZABLE("gwtSerializable"),
    INTERFACE_TYPE("interfaceType"),
    ;

    private final String name;

    private Property(String name) {
      this.name = name;
    }

    @Override public String toString() {
      return name;
    }
  }

  // Store a nullable object instead of an Optional. Escape analysis then
  // allows the JVM to optimize away the Optional objects created by and
  // passed to our API.
  private BuilderFactory builderFactory = null;
  private ParameterizedType generatedBuilder;
  // Store a nullable object instead of an Optional. Escape analysis then
  // allows the JVM to optimize away the Optional objects created by and
  // passed to our API.
  private ParameterizedType optionalBuilder = null;
  private ParameterizedType partialType;
  private ArrayList<Metadata.Property> properties = new ArrayList<Metadata.Property>();
  private ParameterizedType propertyEnum;
  private LinkedHashMap<Metadata.StandardMethod, Metadata.UnderrideLevel> standardMethodUnderrides = new LinkedHashMap<Metadata.StandardMethod, Metadata.UnderrideLevel>();
  private ParameterizedType type;
  private ParameterizedType valueType;
  private boolean builderSerializable;
  private boolean gwtCompatible;
  private boolean gwtSerializable;
  private boolean interfaceType;
  private final EnumSet<Metadata_Builder.Property> _unsetProperties =
      EnumSet.allOf(Metadata_Builder.Property.class);

  /**
   * Sets the value to be returned by {@link Metadata#getBuilderFactory()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code builderFactory} is null
   */
  public Metadata.Builder setBuilderFactory(BuilderFactory builderFactory) {
    this.builderFactory = Preconditions.checkNotNull(builderFactory);
    return (Metadata.Builder) this;
  }

  /**
   * Sets the value to be returned by {@link Metadata#getBuilderFactory()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setBuilderFactory(Optional<? extends BuilderFactory> builderFactory) {
    if (builderFactory.isPresent()) {
      return setBuilderFactory(builderFactory.get());
    } else {
      return clearBuilderFactory();
    }
  }

  /**
   * Sets the value to be returned by {@link Metadata#getBuilderFactory()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setNullableBuilderFactory(@Nullable BuilderFactory builderFactory) {
    if (builderFactory != null) {
      return setBuilderFactory(builderFactory);
    } else {
      return clearBuilderFactory();
    }
  }

  /**
   * Sets the value to be returned by {@link Metadata#getBuilderFactory()}
   * to {@link Optional#absent() Optional.absent()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder clearBuilderFactory() {
    this.builderFactory = null;
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getBuilderFactory()}.
   */
  public Optional<BuilderFactory> getBuilderFactory() {
    return Optional.fromNullable(builderFactory);
  }

  /**
   * Sets the value to be returned by {@link Metadata#getGeneratedBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code generatedBuilder} is null
   */
  public Metadata.Builder setGeneratedBuilder(ParameterizedType generatedBuilder) {
    this.generatedBuilder = Preconditions.checkNotNull(generatedBuilder);
    _unsetProperties.remove(Metadata_Builder.Property.GENERATED_BUILDER);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getGeneratedBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType getGeneratedBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.GENERATED_BUILDER),
        "generatedBuilder not set");
    return generatedBuilder;
  }

  /**
   * Sets the value to be returned by {@link Metadata#getOptionalBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code optionalBuilder} is null
   */
  public Metadata.Builder setOptionalBuilder(ParameterizedType optionalBuilder) {
    this.optionalBuilder = Preconditions.checkNotNull(optionalBuilder);
    return (Metadata.Builder) this;
  }

  /**
   * Sets the value to be returned by {@link Metadata#getOptionalBuilder()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setOptionalBuilder(Optional<? extends ParameterizedType> optionalBuilder) {
    if (optionalBuilder.isPresent()) {
      return setOptionalBuilder(optionalBuilder.get());
    } else {
      return clearOptionalBuilder();
    }
  }

  /**
   * Sets the value to be returned by {@link Metadata#getOptionalBuilder()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setNullableOptionalBuilder(@Nullable ParameterizedType optionalBuilder) {
    if (optionalBuilder != null) {
      return setOptionalBuilder(optionalBuilder);
    } else {
      return clearOptionalBuilder();
    }
  }

  /**
   * Sets the value to be returned by {@link Metadata#getOptionalBuilder()}
   * to {@link Optional#absent() Optional.absent()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder clearOptionalBuilder() {
    this.optionalBuilder = null;
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getOptionalBuilder()}.
   */
  public Optional<ParameterizedType> getOptionalBuilder() {
    return Optional.fromNullable(optionalBuilder);
  }

  /**
   * Sets the value to be returned by {@link Metadata#getPartialType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code partialType} is null
   */
  public Metadata.Builder setPartialType(ParameterizedType partialType) {
    this.partialType = Preconditions.checkNotNull(partialType);
    _unsetProperties.remove(Metadata_Builder.Property.PARTIAL_TYPE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getPartialType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType getPartialType() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.PARTIAL_TYPE),
        "partialType not set");
    return partialType;
  }

  /**
   * Adds {@code element} to the list to be returned from {@link Metadata#getProperties()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code element} is null
   */
  public Metadata.Builder addProperties(Metadata.Property element) {
    this.properties.add(Preconditions.checkNotNull(element));
    return (Metadata.Builder) this;
  }

  /**
   * Adds each element of {@code elements} to the list to be returned from
   * {@link Metadata#getProperties()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code elements} is null or contains a
   *     null element
   */
  public Metadata.Builder addProperties(Metadata.Property... elements) {
    properties.ensureCapacity(properties.size() + elements.length);
    for (Metadata.Property element : elements) {
      addProperties(element);
    }
    return (Metadata.Builder) this;
  }

  /**
   * Adds each element of {@code elements} to the list to be returned from
   * {@link Metadata#getProperties()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code elements} is null or contains a
   *     null element
   */
  public Metadata.Builder addAllProperties(Iterable<? extends Metadata.Property> elements) {
    if (elements instanceof Collection) {
      properties.ensureCapacity(properties.size() + ((Collection<?>) elements).size());
    }
    for (Metadata.Property element : elements) {
      addProperties(element);
    }
    return (Metadata.Builder) this;
  }

  /**
   * Clears the list to be returned from {@link Metadata#getProperties()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder clearProperties() {
    this.properties.clear();
    return (Metadata.Builder) this;
  }

  /**
   * Returns an unmodifiable view of the list that will be returned by
   * {@link Metadata#getProperties()}.
   * Changes to this builder will be reflected in the view.
   */
  public List<Metadata.Property> getProperties() {
    return Collections.unmodifiableList(properties);
  }

  /**
   * Sets the value to be returned by {@link Metadata#getPropertyEnum()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code propertyEnum} is null
   */
  public Metadata.Builder setPropertyEnum(ParameterizedType propertyEnum) {
    this.propertyEnum = Preconditions.checkNotNull(propertyEnum);
    _unsetProperties.remove(Metadata_Builder.Property.PROPERTY_ENUM);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getPropertyEnum()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType getPropertyEnum() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.PROPERTY_ENUM),
        "propertyEnum not set");
    return propertyEnum;
  }

  /**
   * Associates {@code key} with {@code value} in the map to be returned from
   * {@link Metadata#getStandardMethodUnderrides()}.
   * Duplicate keys are not allowed.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if either {@code key} or {@code value} are null
   * @throws IllegalArgumentException if {@code key} is already present
   */
  public Metadata.Builder putStandardMethodUnderrides(Metadata.StandardMethod key, Metadata.UnderrideLevel value) {
    Preconditions.checkNotNull(key);
    Preconditions.checkNotNull(value);
    Preconditions.checkArgument(!standardMethodUnderrides.containsKey(key),
        "Key already present in standardMethodUnderrides: %s", key);
    this.standardMethodUnderrides.put(key, value);
    return (Metadata.Builder) this;
  }

  /**
   * Associates all of {@code map}'s keys and values in the map to be returned
   * from {@link Metadata#getStandardMethodUnderrides()}.
   * Duplicate keys are not allowed.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code map} is null or contains a
   *     null key or value
   * @throws IllegalArgumentException if any key is already present
   */
  public Metadata.Builder putAllStandardMethodUnderrides(Map<? extends Metadata.StandardMethod, ? extends Metadata.UnderrideLevel> map) {
    for (Metadata.StandardMethod key : map.keySet()) {
      putStandardMethodUnderrides(key, map.get(key));
    }
    return (Metadata.Builder) this;
  }

  /**
   * Removes the mapping for {@code key} from the map to be returned from
   * {@link Metadata#getStandardMethodUnderrides()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code key} is null
   * @throws IllegalArgumentException if {@code key} is not present
   */
  public Metadata.Builder removeStandardMethodUnderrides(Metadata.StandardMethod key) {
    Preconditions.checkNotNull(key);
    Preconditions.checkArgument(standardMethodUnderrides.containsKey(key),
        "Key not present in standardMethodUnderrides: %s", key);
    standardMethodUnderrides.remove(key);
    return (Metadata.Builder) this;
  }

  /**
   * Removes all of the mappings from the map to be returned from 
   * {@link Metadata#getStandardMethodUnderrides()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder clearStandardMethodUnderrides() {
    this.standardMethodUnderrides.clear();
    return (Metadata.Builder) this;
  }

  /**
   * Returns an unmodifiable view of the map that will be returned by
   * {@link Metadata#getStandardMethodUnderrides()}.
   * Changes to this builder will be reflected in the view.
   */
  public Map<Metadata.StandardMethod, Metadata.UnderrideLevel> getStandardMethodUnderrides() {
    return Collections.unmodifiableMap(standardMethodUnderrides);
  }

  /**
   * Sets the value to be returned by {@link Metadata#getType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code type} is null
   */
  public Metadata.Builder setType(ParameterizedType type) {
    this.type = Preconditions.checkNotNull(type);
    _unsetProperties.remove(Metadata_Builder.Property.TYPE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType getType() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.TYPE),
        "type not set");
    return type;
  }

  /**
   * Sets the value to be returned by {@link Metadata#getValueType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code valueType} is null
   */
  public Metadata.Builder setValueType(ParameterizedType valueType) {
    this.valueType = Preconditions.checkNotNull(valueType);
    _unsetProperties.remove(Metadata_Builder.Property.VALUE_TYPE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#getValueType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType getValueType() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.VALUE_TYPE),
        "valueType not set");
    return valueType;
  }

  /**
   * Sets the value to be returned by {@link Metadata#isBuilderSerializable()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setBuilderSerializable(boolean builderSerializable) {
    this.builderSerializable = builderSerializable;
    _unsetProperties.remove(Metadata_Builder.Property.BUILDER_SERIALIZABLE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#isBuilderSerializable()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public boolean isBuilderSerializable() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.BUILDER_SERIALIZABLE),
        "builderSerializable not set");
    return builderSerializable;
  }

  /**
   * Sets the value to be returned by {@link Metadata#isGwtCompatible()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setGwtCompatible(boolean gwtCompatible) {
    this.gwtCompatible = gwtCompatible;
    _unsetProperties.remove(Metadata_Builder.Property.GWT_COMPATIBLE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#isGwtCompatible()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public boolean isGwtCompatible() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.GWT_COMPATIBLE),
        "gwtCompatible not set");
    return gwtCompatible;
  }

  /**
   * Sets the value to be returned by {@link Metadata#isGwtSerializable()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setGwtSerializable(boolean gwtSerializable) {
    this.gwtSerializable = gwtSerializable;
    _unsetProperties.remove(Metadata_Builder.Property.GWT_SERIALIZABLE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#isGwtSerializable()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public boolean isGwtSerializable() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.GWT_SERIALIZABLE),
        "gwtSerializable not set");
    return gwtSerializable;
  }

  /**
   * Sets the value to be returned by {@link Metadata#isInterfaceType()}.
   *
   * @return this {@code Builder} object
   */
  public Metadata.Builder setInterfaceType(boolean interfaceType) {
    this.interfaceType = interfaceType;
    _unsetProperties.remove(Metadata_Builder.Property.INTERFACE_TYPE);
    return (Metadata.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link Metadata#isInterfaceType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public boolean isInterfaceType() {
    Preconditions.checkState(
        !_unsetProperties.contains(Metadata_Builder.Property.INTERFACE_TYPE),
        "interfaceType not set");
    return interfaceType;
  }

  private static final class Value extends Metadata {
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final BuilderFactory builderFactory;
    private final ParameterizedType generatedBuilder;
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final ParameterizedType optionalBuilder;
    private final ParameterizedType partialType;
    private final ImmutableList<Metadata.Property> properties;
    private final ParameterizedType propertyEnum;
    private final ImmutableMap<Metadata.StandardMethod, Metadata.UnderrideLevel> standardMethodUnderrides;
    private final ParameterizedType type;
    private final ParameterizedType valueType;
    private final boolean builderSerializable;
    private final boolean gwtCompatible;
    private final boolean gwtSerializable;
    private final boolean interfaceType;

    private Value(Metadata_Builder builder) {
      this.builderFactory = builder.builderFactory;
      this.generatedBuilder = builder.generatedBuilder;
      this.optionalBuilder = builder.optionalBuilder;
      this.partialType = builder.partialType;
      this.properties = ImmutableList.copyOf(builder.properties);
      this.propertyEnum = builder.propertyEnum;
      this.standardMethodUnderrides = ImmutableMap.copyOf(builder.standardMethodUnderrides);
      this.type = builder.type;
      this.valueType = builder.valueType;
      this.builderSerializable = builder.builderSerializable;
      this.gwtCompatible = builder.gwtCompatible;
      this.gwtSerializable = builder.gwtSerializable;
      this.interfaceType = builder.interfaceType;
    }

    @Override
    public Optional<BuilderFactory> getBuilderFactory() {
      return Optional.fromNullable(builderFactory);
    }

    @Override
    public ParameterizedType getGeneratedBuilder() {
      return generatedBuilder;
    }

    @Override
    public Optional<ParameterizedType> getOptionalBuilder() {
      return Optional.fromNullable(optionalBuilder);
    }

    @Override
    public ParameterizedType getPartialType() {
      return partialType;
    }

    @Override
    public ImmutableList<Metadata.Property> getProperties() {
      return properties;
    }

    @Override
    public ParameterizedType getPropertyEnum() {
      return propertyEnum;
    }

    @Override
    public ImmutableMap<Metadata.StandardMethod, Metadata.UnderrideLevel> getStandardMethodUnderrides() {
      return standardMethodUnderrides;
    }

    @Override
    public ParameterizedType getType() {
      return type;
    }

    @Override
    public ParameterizedType getValueType() {
      return valueType;
    }

    @Override
    public boolean isBuilderSerializable() {
      return builderSerializable;
    }

    @Override
    public boolean isGwtCompatible() {
      return gwtCompatible;
    }

    @Override
    public boolean isGwtSerializable() {
      return gwtSerializable;
    }

    @Override
    public boolean isInterfaceType() {
      return interfaceType;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Metadata_Builder.Value)) {
        return false;
      }
      Metadata_Builder.Value other = (Metadata_Builder.Value) obj;
      if (builderFactory != other.builderFactory
          && (builderFactory == null || !builderFactory.equals(other.builderFactory))) {
        return false;
      }
      if (!generatedBuilder.equals(other.generatedBuilder)) {
        return false;
      }
      if (optionalBuilder != other.optionalBuilder
          && (optionalBuilder == null || !optionalBuilder.equals(other.optionalBuilder))) {
        return false;
      }
      if (!partialType.equals(other.partialType)) {
        return false;
      }
      if (!properties.equals(other.properties)) {
        return false;
      }
      if (!propertyEnum.equals(other.propertyEnum)) {
        return false;
      }
      if (!standardMethodUnderrides.equals(other.standardMethodUnderrides)) {
        return false;
      }
      if (!type.equals(other.type)) {
        return false;
      }
      if (!valueType.equals(other.valueType)) {
        return false;
      }
      if (builderSerializable != other.builderSerializable) {
        return false;
      }
      if (gwtCompatible != other.gwtCompatible) {
        return false;
      }
      if (gwtSerializable != other.gwtSerializable) {
        return false;
      }
      if (interfaceType != other.interfaceType) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(new Object[] { builderFactory, generatedBuilder, optionalBuilder, partialType, properties, propertyEnum, standardMethodUnderrides, type, valueType, builderSerializable, gwtCompatible, gwtSerializable, interfaceType });
    }

    @Override
    public String toString() {
      return "Metadata{"
          + COMMA_JOINER.join(
              (builderFactory != null ? "builderFactory=" + builderFactory : null),
              "generatedBuilder=" + generatedBuilder,
              (optionalBuilder != null ? "optionalBuilder=" + optionalBuilder : null),
              "partialType=" + partialType,
              "properties=" + properties,
              "propertyEnum=" + propertyEnum,
              "standardMethodUnderrides=" + standardMethodUnderrides,
              "type=" + type,
              "valueType=" + valueType,
              "builderSerializable=" + builderSerializable,
              "gwtCompatible=" + gwtCompatible,
              "gwtSerializable=" + gwtSerializable,
              "interfaceType=" + interfaceType)
          + "}";
    }
  }

  /**
   * Returns a newly-created {@link Metadata} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public Metadata build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new Metadata_Builder.Value(this);
  }

  /**
   * Sets all property values using the given {@code Metadata} as a template.
   */
  public Metadata.Builder mergeFrom(Metadata value) {
    setBuilderFactory(value.getBuilderFactory());
    setGeneratedBuilder(value.getGeneratedBuilder());
    setOptionalBuilder(value.getOptionalBuilder());
    setPartialType(value.getPartialType());
    addAllProperties(value.getProperties());
    setPropertyEnum(value.getPropertyEnum());
    putAllStandardMethodUnderrides(value.getStandardMethodUnderrides());
    setType(value.getType());
    setValueType(value.getValueType());
    setBuilderSerializable(value.isBuilderSerializable());
    setGwtCompatible(value.isGwtCompatible());
    setGwtSerializable(value.isGwtSerializable());
    setInterfaceType(value.isInterfaceType());
    return (Metadata.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}.
   * Does not affect any properties not set on the input.
   */
  public Metadata.Builder mergeFrom(Metadata.Builder template) {
    // Upcast to access the private _unsetProperties field.
    // Otherwise, oddly, we get an access violation.
    EnumSet<Metadata_Builder.Property> _templateUnset = ((Metadata_Builder) template)._unsetProperties;
    setBuilderFactory(template.getBuilderFactory());
    if (!_templateUnset.contains(Metadata_Builder.Property.GENERATED_BUILDER)) {
      setGeneratedBuilder(template.getGeneratedBuilder());
    }
    setOptionalBuilder(template.getOptionalBuilder());
    if (!_templateUnset.contains(Metadata_Builder.Property.PARTIAL_TYPE)) {
      setPartialType(template.getPartialType());
    }
    addAllProperties(((Metadata_Builder) template).properties);
    if (!_templateUnset.contains(Metadata_Builder.Property.PROPERTY_ENUM)) {
      setPropertyEnum(template.getPropertyEnum());
    }
    putAllStandardMethodUnderrides(((Metadata_Builder) template).standardMethodUnderrides);
    if (!_templateUnset.contains(Metadata_Builder.Property.TYPE)) {
      setType(template.getType());
    }
    if (!_templateUnset.contains(Metadata_Builder.Property.VALUE_TYPE)) {
      setValueType(template.getValueType());
    }
    if (!_templateUnset.contains(Metadata_Builder.Property.BUILDER_SERIALIZABLE)) {
      setBuilderSerializable(template.isBuilderSerializable());
    }
    if (!_templateUnset.contains(Metadata_Builder.Property.GWT_COMPATIBLE)) {
      setGwtCompatible(template.isGwtCompatible());
    }
    if (!_templateUnset.contains(Metadata_Builder.Property.GWT_SERIALIZABLE)) {
      setGwtSerializable(template.isGwtSerializable());
    }
    if (!_templateUnset.contains(Metadata_Builder.Property.INTERFACE_TYPE)) {
      setInterfaceType(template.isInterfaceType());
    }
    return (Metadata.Builder) this;
  }

  /**
   * Resets the state of this builder.
   */
  public Metadata.Builder clear() {
    Metadata_Builder _template = new Metadata.Builder();
    builderFactory = _template.builderFactory;
    generatedBuilder = _template.generatedBuilder;
    optionalBuilder = _template.optionalBuilder;
    partialType = _template.partialType;
    properties.clear();
    propertyEnum = _template.propertyEnum;
    standardMethodUnderrides.clear();
    type = _template.type;
    valueType = _template.valueType;
    builderSerializable = _template.builderSerializable;
    gwtCompatible = _template.gwtCompatible;
    gwtSerializable = _template.gwtSerializable;
    interfaceType = _template.interfaceType;
    _unsetProperties.clear();
    _unsetProperties.addAll(_template._unsetProperties);
    return (Metadata.Builder) this;
  }

  private static final class Partial extends Metadata {
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final BuilderFactory builderFactory;
    private final ParameterizedType generatedBuilder;
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final ParameterizedType optionalBuilder;
    private final ParameterizedType partialType;
    private final ImmutableList<Metadata.Property> properties;
    private final ParameterizedType propertyEnum;
    private final ImmutableMap<Metadata.StandardMethod, Metadata.UnderrideLevel> standardMethodUnderrides;
    private final ParameterizedType type;
    private final ParameterizedType valueType;
    private final boolean builderSerializable;
    private final boolean gwtCompatible;
    private final boolean gwtSerializable;
    private final boolean interfaceType;
    private final EnumSet<Metadata_Builder.Property> _unsetProperties;

    Partial(Metadata_Builder builder) {
      this.builderFactory = builder.builderFactory;
      this.generatedBuilder = builder.generatedBuilder;
      this.optionalBuilder = builder.optionalBuilder;
      this.partialType = builder.partialType;
      this.properties = ImmutableList.copyOf(builder.properties);
      this.propertyEnum = builder.propertyEnum;
      this.standardMethodUnderrides = ImmutableMap.copyOf(builder.standardMethodUnderrides);
      this.type = builder.type;
      this.valueType = builder.valueType;
      this.builderSerializable = builder.builderSerializable;
      this.gwtCompatible = builder.gwtCompatible;
      this.gwtSerializable = builder.gwtSerializable;
      this.interfaceType = builder.interfaceType;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    public Optional<BuilderFactory> getBuilderFactory() {
      return Optional.fromNullable(builderFactory);
    }

    @Override
    public ParameterizedType getGeneratedBuilder() {
      if (_unsetProperties.contains(Metadata_Builder.Property.GENERATED_BUILDER)) {
        throw new UnsupportedOperationException("generatedBuilder not set");
      }
      return generatedBuilder;
    }

    @Override
    public Optional<ParameterizedType> getOptionalBuilder() {
      return Optional.fromNullable(optionalBuilder);
    }

    @Override
    public ParameterizedType getPartialType() {
      if (_unsetProperties.contains(Metadata_Builder.Property.PARTIAL_TYPE)) {
        throw new UnsupportedOperationException("partialType not set");
      }
      return partialType;
    }

    @Override
    public ImmutableList<Metadata.Property> getProperties() {
      return properties;
    }

    @Override
    public ParameterizedType getPropertyEnum() {
      if (_unsetProperties.contains(Metadata_Builder.Property.PROPERTY_ENUM)) {
        throw new UnsupportedOperationException("propertyEnum not set");
      }
      return propertyEnum;
    }

    @Override
    public ImmutableMap<Metadata.StandardMethod, Metadata.UnderrideLevel> getStandardMethodUnderrides() {
      return standardMethodUnderrides;
    }

    @Override
    public ParameterizedType getType() {
      if (_unsetProperties.contains(Metadata_Builder.Property.TYPE)) {
        throw new UnsupportedOperationException("type not set");
      }
      return type;
    }

    @Override
    public ParameterizedType getValueType() {
      if (_unsetProperties.contains(Metadata_Builder.Property.VALUE_TYPE)) {
        throw new UnsupportedOperationException("valueType not set");
      }
      return valueType;
    }

    @Override
    public boolean isBuilderSerializable() {
      if (_unsetProperties.contains(Metadata_Builder.Property.BUILDER_SERIALIZABLE)) {
        throw new UnsupportedOperationException("builderSerializable not set");
      }
      return builderSerializable;
    }

    @Override
    public boolean isGwtCompatible() {
      if (_unsetProperties.contains(Metadata_Builder.Property.GWT_COMPATIBLE)) {
        throw new UnsupportedOperationException("gwtCompatible not set");
      }
      return gwtCompatible;
    }

    @Override
    public boolean isGwtSerializable() {
      if (_unsetProperties.contains(Metadata_Builder.Property.GWT_SERIALIZABLE)) {
        throw new UnsupportedOperationException("gwtSerializable not set");
      }
      return gwtSerializable;
    }

    @Override
    public boolean isInterfaceType() {
      if (_unsetProperties.contains(Metadata_Builder.Property.INTERFACE_TYPE)) {
        throw new UnsupportedOperationException("interfaceType not set");
      }
      return interfaceType;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Metadata_Builder.Partial)) {
        return false;
      }
      Metadata_Builder.Partial other = (Metadata_Builder.Partial) obj;
      if (builderFactory != other.builderFactory
          && (builderFactory == null || !builderFactory.equals(other.builderFactory))) {
        return false;
      }
      if (generatedBuilder != other.generatedBuilder
          && (generatedBuilder == null || !generatedBuilder.equals(other.generatedBuilder))) {
        return false;
      }
      if (optionalBuilder != other.optionalBuilder
          && (optionalBuilder == null || !optionalBuilder.equals(other.optionalBuilder))) {
        return false;
      }
      if (partialType != other.partialType
          && (partialType == null || !partialType.equals(other.partialType))) {
        return false;
      }
      if (!properties.equals(other.properties)) {
        return false;
      }
      if (propertyEnum != other.propertyEnum
          && (propertyEnum == null || !propertyEnum.equals(other.propertyEnum))) {
        return false;
      }
      if (!standardMethodUnderrides.equals(other.standardMethodUnderrides)) {
        return false;
      }
      if (type != other.type
          && (type == null || !type.equals(other.type))) {
        return false;
      }
      if (valueType != other.valueType
          && (valueType == null || !valueType.equals(other.valueType))) {
        return false;
      }
      if (builderSerializable != other.builderSerializable) {
        return false;
      }
      if (gwtCompatible != other.gwtCompatible) {
        return false;
      }
      if (gwtSerializable != other.gwtSerializable) {
        return false;
      }
      if (interfaceType != other.interfaceType) {
        return false;
      }
      return _unsetProperties.equals(other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(new Object[] { builderFactory, generatedBuilder, optionalBuilder, partialType, properties, propertyEnum, standardMethodUnderrides, type, valueType, builderSerializable, gwtCompatible, gwtSerializable, interfaceType, _unsetProperties });
    }

    @Override
    public String toString() {
      return "partial Metadata{"
          + COMMA_JOINER.join(
              (builderFactory != null ? "builderFactory=" + builderFactory : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.GENERATED_BUILDER)
                  ? "generatedBuilder=" + generatedBuilder : null),
              (optionalBuilder != null ? "optionalBuilder=" + optionalBuilder : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.PARTIAL_TYPE)
                  ? "partialType=" + partialType : null),
              "properties=" + properties,
              (!_unsetProperties.contains(Metadata_Builder.Property.PROPERTY_ENUM)
                  ? "propertyEnum=" + propertyEnum : null),
              "standardMethodUnderrides=" + standardMethodUnderrides,
              (!_unsetProperties.contains(Metadata_Builder.Property.TYPE)
                  ? "type=" + type : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.VALUE_TYPE)
                  ? "valueType=" + valueType : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.BUILDER_SERIALIZABLE)
                  ? "builderSerializable=" + builderSerializable : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.GWT_COMPATIBLE)
                  ? "gwtCompatible=" + gwtCompatible : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.GWT_SERIALIZABLE)
                  ? "gwtSerializable=" + gwtSerializable : null),
              (!_unsetProperties.contains(Metadata_Builder.Property.INTERFACE_TYPE)
                  ? "interfaceType=" + interfaceType : null))
          + "}";
    }
  }

  /**
   * Returns a newly-created partial {@link Metadata}
   * based on the contents of the {@code Builder}.
   * State checking will not be performed.
   * Unset properties will throw an {@link UnsupportedOperationException}
   * when accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests.
   */
  @VisibleForTesting()
  public Metadata buildPartial() {
    return new Metadata_Builder.Partial(this);
  }
}
