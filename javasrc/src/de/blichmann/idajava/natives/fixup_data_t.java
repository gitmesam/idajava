/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class fixup_data_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public fixup_data_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(fixup_data_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_fixup_data_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(short value) {
    IdaJavaJNI.fixup_data_t_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return IdaJavaJNI.fixup_data_t_type_get(swigCPtr, this);
  }

  public void setSel(int value) {
    IdaJavaJNI.fixup_data_t_sel_set(swigCPtr, this, value);
  }

  public int getSel() {
    return IdaJavaJNI.fixup_data_t_sel_get(swigCPtr, this);
  }

  public void setOff(long value) {
    IdaJavaJNI.fixup_data_t_off_set(swigCPtr, this, value);
  }

  public long getOff() {
    return IdaJavaJNI.fixup_data_t_off_get(swigCPtr, this);
  }

  public void setDisplacement(int value) {
    IdaJavaJNI.fixup_data_t_displacement_set(swigCPtr, this, value);
  }

  public int getDisplacement() {
    return IdaJavaJNI.fixup_data_t_displacement_get(swigCPtr, this);
  }

  public boolean is_custom() {
    return IdaJavaJNI.fixup_data_t_is_custom(swigCPtr, this);
  }

  public fixup_data_t() {
    this(IdaJavaJNI.new_fixup_data_t(), true);
  }

}
