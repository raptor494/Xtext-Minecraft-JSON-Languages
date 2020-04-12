/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.validation;

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@FinalFieldsConstructor
@ToString
@SuppressWarnings("all")
public class SeenInfo<T extends Object> {
  public final T value;
  
  public boolean errored = false;
  
  public SeenInfo(final T value) {
    super();
    this.value = value;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("value", this.value);
    b.add("errored", this.errored);
    return b.toString();
  }
}
