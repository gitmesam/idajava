/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class regarg_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public regarg_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(regarg_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_regarg_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReg(int value) {
    IdaJavaJNI.regarg_t_reg_set(swigCPtr, this, value);
  }

  public int getReg() {
    return IdaJavaJNI.regarg_t_reg_get(swigCPtr, this);
  }

  public void setType(SWIGTYPE_p_type_t value) {
    IdaJavaJNI.regarg_t_type_set(swigCPtr, this, SWIGTYPE_p_type_t.getCPtr(value));
  }

  public SWIGTYPE_p_type_t getType() {
    long cPtr = IdaJavaJNI.regarg_t_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_type_t(cPtr, false);
  }

  public void setName(String value) {
    IdaJavaJNI.regarg_t_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return IdaJavaJNI.regarg_t_name_get(swigCPtr, this);
  }

  public regarg_t() {
    this(IdaJavaJNI.new_regarg_t(), true);
  }

}
