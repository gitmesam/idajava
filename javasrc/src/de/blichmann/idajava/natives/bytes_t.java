/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class bytes_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public bytes_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(bytes_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_bytes_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLen(short value) {
    IdaJavaJNI.bytes_t_len_set(swigCPtr, this, value);
  }

  public short getLen() {
    return IdaJavaJNI.bytes_t_len_get(swigCPtr, this);
  }

  public void setBytes(SWIGTYPE_p_unsigned_char value) {
    IdaJavaJNI.bytes_t_bytes_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getBytes() {
    long cPtr = IdaJavaJNI.bytes_t_bytes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public bytes_t() {
    this(IdaJavaJNI.new_bytes_t(), true);
  }

}
