/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.financial.analytics.ircurve.strips;

import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.analytics.financial.credit.isdastandardmodel.ISDAInstrumentTypes;
import com.opengamma.financial.analytics.curve.IsdaYieldCurveDefinition;
import com.opengamma.id.ExternalId;
import com.opengamma.util.time.Tenor;

/**
 * The super type for ISDA yield curve nodes, referenced by
 * {@link IsdaYieldCurveDefinition}.
 */
@BeanDefinition
public abstract class IsdaYieldCurveNode extends CurveNode {

  private static final long serialVersionUID = 1L;

  /**
   * The tenor of the node.
   */
  @PropertyDefinition(validate = "notNull")
  private Tenor _tenor;
  
  /**
   * The market data ticker referenced by the node.
   */
  @PropertyDefinition(validate = "notNull")
  private ExternalId _ticker;

  /**
   * The dataField, typically "Market_Value".
   */
  @PropertyDefinition(validate = "notNull")
  private String _dataField;
  
  @Override
  public Tenor getResolvedMaturity() {
    return _tenor;
  }
  
  public abstract ISDAInstrumentTypes getISDAInstrumentType();
  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code IsdaYieldCurveNode}.
   * @return the meta-bean, not null
   */
  public static IsdaYieldCurveNode.Meta meta() {
    return IsdaYieldCurveNode.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(IsdaYieldCurveNode.Meta.INSTANCE);
  }

  @Override
  public IsdaYieldCurveNode.Meta metaBean() {
    return IsdaYieldCurveNode.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the tenor of the node.
   * @return the value of the property, not null
   */
  public Tenor getTenor() {
    return _tenor;
  }

  /**
   * Sets the tenor of the node.
   * @param tenor  the new value of the property, not null
   */
  public void setTenor(Tenor tenor) {
    JodaBeanUtils.notNull(tenor, "tenor");
    this._tenor = tenor;
  }

  /**
   * Gets the the {@code tenor} property.
   * @return the property, not null
   */
  public final Property<Tenor> tenor() {
    return metaBean().tenor().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the market data ticker referenced by the node.
   * @return the value of the property, not null
   */
  public ExternalId getTicker() {
    return _ticker;
  }

  /**
   * Sets the market data ticker referenced by the node.
   * @param ticker  the new value of the property, not null
   */
  public void setTicker(ExternalId ticker) {
    JodaBeanUtils.notNull(ticker, "ticker");
    this._ticker = ticker;
  }

  /**
   * Gets the the {@code ticker} property.
   * @return the property, not null
   */
  public final Property<ExternalId> ticker() {
    return metaBean().ticker().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the dataField, typically "Market_Value".
   * @return the value of the property, not null
   */
  public String getDataField() {
    return _dataField;
  }

  /**
   * Sets the dataField, typically "Market_Value".
   * @param dataField  the new value of the property, not null
   */
  public void setDataField(String dataField) {
    JodaBeanUtils.notNull(dataField, "dataField");
    this._dataField = dataField;
  }

  /**
   * Gets the the {@code dataField} property.
   * @return the property, not null
   */
  public final Property<String> dataField() {
    return metaBean().dataField().createProperty(this);
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      IsdaYieldCurveNode other = (IsdaYieldCurveNode) obj;
      return JodaBeanUtils.equal(getTenor(), other.getTenor()) &&
          JodaBeanUtils.equal(getTicker(), other.getTicker()) &&
          JodaBeanUtils.equal(getDataField(), other.getDataField()) &&
          super.equals(obj);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash += hash * 31 + JodaBeanUtils.hashCode(getTenor());
    hash += hash * 31 + JodaBeanUtils.hashCode(getTicker());
    hash += hash * 31 + JodaBeanUtils.hashCode(getDataField());
    return hash ^ super.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("IsdaYieldCurveNode{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  @Override
  protected void toString(StringBuilder buf) {
    super.toString(buf);
    buf.append("tenor").append('=').append(JodaBeanUtils.toString(getTenor())).append(',').append(' ');
    buf.append("ticker").append('=').append(JodaBeanUtils.toString(getTicker())).append(',').append(' ');
    buf.append("dataField").append('=').append(JodaBeanUtils.toString(getDataField())).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code IsdaYieldCurveNode}.
   */
  public static class Meta extends CurveNode.Meta {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code tenor} property.
     */
    private final MetaProperty<Tenor> _tenor = DirectMetaProperty.ofReadWrite(
        this, "tenor", IsdaYieldCurveNode.class, Tenor.class);
    /**
     * The meta-property for the {@code ticker} property.
     */
    private final MetaProperty<ExternalId> _ticker = DirectMetaProperty.ofReadWrite(
        this, "ticker", IsdaYieldCurveNode.class, ExternalId.class);
    /**
     * The meta-property for the {@code dataField} property.
     */
    private final MetaProperty<String> _dataField = DirectMetaProperty.ofReadWrite(
        this, "dataField", IsdaYieldCurveNode.class, String.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, (DirectMetaPropertyMap) super.metaPropertyMap(),
        "tenor",
        "ticker",
        "dataField");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 110246592:  // tenor
          return _tenor;
        case -873960694:  // ticker
          return _ticker;
        case -386794640:  // dataField
          return _dataField;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends IsdaYieldCurveNode> builder() {
      throw new UnsupportedOperationException("IsdaYieldCurveNode is an abstract class");
    }

    @Override
    public Class<? extends IsdaYieldCurveNode> beanType() {
      return IsdaYieldCurveNode.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code tenor} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Tenor> tenor() {
      return _tenor;
    }

    /**
     * The meta-property for the {@code ticker} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<ExternalId> ticker() {
      return _ticker;
    }

    /**
     * The meta-property for the {@code dataField} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<String> dataField() {
      return _dataField;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 110246592:  // tenor
          return ((IsdaYieldCurveNode) bean).getTenor();
        case -873960694:  // ticker
          return ((IsdaYieldCurveNode) bean).getTicker();
        case -386794640:  // dataField
          return ((IsdaYieldCurveNode) bean).getDataField();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 110246592:  // tenor
          ((IsdaYieldCurveNode) bean).setTenor((Tenor) newValue);
          return;
        case -873960694:  // ticker
          ((IsdaYieldCurveNode) bean).setTicker((ExternalId) newValue);
          return;
        case -386794640:  // dataField
          ((IsdaYieldCurveNode) bean).setDataField((String) newValue);
          return;
      }
      super.propertySet(bean, propertyName, newValue, quiet);
    }

    @Override
    protected void validate(Bean bean) {
      JodaBeanUtils.notNull(((IsdaYieldCurveNode) bean)._tenor, "tenor");
      JodaBeanUtils.notNull(((IsdaYieldCurveNode) bean)._ticker, "ticker");
      JodaBeanUtils.notNull(((IsdaYieldCurveNode) bean)._dataField, "dataField");
      super.validate(bean);
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}