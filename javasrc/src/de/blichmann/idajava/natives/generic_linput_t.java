/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class generic_linput_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public generic_linput_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(generic_linput_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_generic_linput_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFilesize(long value) {
    IdaJavaJNI.generic_linput_t_filesize_set(swigCPtr, this, value);
  }

  public long getFilesize() {
    return IdaJavaJNI.generic_linput_t_filesize_get(swigCPtr, this);
  }

  public void setBlocksize(long value) {
    IdaJavaJNI.generic_linput_t_blocksize_set(swigCPtr, this, value);
  }

  public long getBlocksize() {
    return IdaJavaJNI.generic_linput_t_blocksize_get(swigCPtr, this);
  }

  public int read(SWIGTYPE_p_off_t off, SWIGTYPE_p_void buffer, long nbytes) {
    return IdaJavaJNI.generic_linput_t_read(swigCPtr, this, SWIGTYPE_p_off_t.getCPtr(off), SWIGTYPE_p_void.getCPtr(buffer), nbytes);
  }

}