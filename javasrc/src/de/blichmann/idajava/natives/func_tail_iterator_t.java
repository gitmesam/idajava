/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class func_tail_iterator_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public func_tail_iterator_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(func_tail_iterator_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_func_tail_iterator_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public func_tail_iterator_t() {
    this(IdaJavaJNI.new_func_tail_iterator_t__SWIG_0(), true);
  }

  public func_tail_iterator_t(func_t _pfn, long ea) {
    this(IdaJavaJNI.new_func_tail_iterator_t__SWIG_1(func_t.getCPtr(_pfn), _pfn, ea), true);
  }

  public func_tail_iterator_t(func_t _pfn) {
    this(IdaJavaJNI.new_func_tail_iterator_t__SWIG_2(func_t.getCPtr(_pfn), _pfn), true);
  }

  public boolean set(func_t _pfn, long ea) {
    return IdaJavaJNI.func_tail_iterator_t_set__SWIG_0(swigCPtr, this, func_t.getCPtr(_pfn), _pfn, ea);
  }

  public boolean set(func_t _pfn) {
    return IdaJavaJNI.func_tail_iterator_t_set__SWIG_1(swigCPtr, this, func_t.getCPtr(_pfn), _pfn);
  }

  public boolean set_ea(long ea) {
    return IdaJavaJNI.func_tail_iterator_t_set_ea(swigCPtr, this, ea);
  }

  public boolean set_range(long ea1, long ea2) {
    return IdaJavaJNI.func_tail_iterator_t_set_range(swigCPtr, this, ea1, ea2);
  }

  public area_t chunk() {
    return new area_t(IdaJavaJNI.func_tail_iterator_t_chunk(swigCPtr, this), false);
  }

  public boolean first() {
    return IdaJavaJNI.func_tail_iterator_t_first(swigCPtr, this);
  }

  public boolean last() {
    return IdaJavaJNI.func_tail_iterator_t_last(swigCPtr, this);
  }

  public boolean next() {
    return IdaJavaJNI.func_tail_iterator_t_next(swigCPtr, this);
  }

  public boolean prev() {
    return IdaJavaJNI.func_tail_iterator_t_prev(swigCPtr, this);
  }

  public boolean main() {
    return IdaJavaJNI.func_tail_iterator_t_main(swigCPtr, this);
  }

}
