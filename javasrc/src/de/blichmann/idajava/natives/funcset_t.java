/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class funcset_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public funcset_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(funcset_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_funcset_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setQnty(int value) {
    IdaJavaJNI.funcset_t_qnty_set(swigCPtr, this, value);
  }

  public int getQnty() {
    return IdaJavaJNI.funcset_t_qnty_get(swigCPtr, this);
  }

  public void setF(extfun_t value) {
    IdaJavaJNI.funcset_t_f_set(swigCPtr, this, extfun_t.getCPtr(value), value);
  }

  public extfun_t getF() {
    long cPtr = IdaJavaJNI.funcset_t_f_get(swigCPtr, this);
    return (cPtr == 0) ? null : new extfun_t(cPtr, false);
  }

  public void setStartup(SWIGTYPE_p_f_void__error_t value) {
    IdaJavaJNI.funcset_t_startup_set(swigCPtr, this, SWIGTYPE_p_f_void__error_t.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__error_t getStartup() {
    long cPtr = IdaJavaJNI.funcset_t_startup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__error_t(cPtr, false);
  }

  public void setShutdown(SWIGTYPE_p_f_void__error_t value) {
    IdaJavaJNI.funcset_t_shutdown_set(swigCPtr, this, SWIGTYPE_p_f_void__error_t.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__error_t getShutdown() {
    long cPtr = IdaJavaJNI.funcset_t_shutdown_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__error_t(cPtr, false);
  }

}
