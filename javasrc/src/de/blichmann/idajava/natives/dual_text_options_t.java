/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class dual_text_options_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public dual_text_options_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(dual_text_options_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_dual_text_options_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMysize(int value) {
    IdaJavaJNI.dual_text_options_t_mysize_set(swigCPtr, this, value);
  }

  public int getMysize() {
    return IdaJavaJNI.dual_text_options_t_mysize_get(swigCPtr, this);
  }

  public void setGraph_view(short value) {
    IdaJavaJNI.dual_text_options_t_graph_view_set(swigCPtr, this, value);
  }

  public short getGraph_view() {
    return IdaJavaJNI.dual_text_options_t_graph_view_get(swigCPtr, this);
  }

  public void setXrefnum(short value) {
    IdaJavaJNI.dual_text_options_t_xrefnum_set(swigCPtr, this, value);
  }

  public short getXrefnum() {
    return IdaJavaJNI.dual_text_options_t_xrefnum_get(swigCPtr, this);
  }

  public void setS_showpref(short value) {
    IdaJavaJNI.dual_text_options_t_s_showpref_set(swigCPtr, this, value);
  }

  public short getS_showpref() {
    return IdaJavaJNI.dual_text_options_t_s_showpref_get(swigCPtr, this);
  }

  public void setComment(short value) {
    IdaJavaJNI.dual_text_options_t_comment_set(swigCPtr, this, value);
  }

  public short getComment() {
    return IdaJavaJNI.dual_text_options_t_comment_get(swigCPtr, this);
  }

  public void setIndent(short value) {
    IdaJavaJNI.dual_text_options_t_indent_set(swigCPtr, this, value);
  }

  public short getIndent() {
    return IdaJavaJNI.dual_text_options_t_indent_get(swigCPtr, this);
  }

  public void setS_limiter(short value) {
    IdaJavaJNI.dual_text_options_t_s_limiter_set(swigCPtr, this, value);
  }

  public short getS_limiter() {
    return IdaJavaJNI.dual_text_options_t_s_limiter_get(swigCPtr, this);
  }

  public void setMargin(int value) {
    IdaJavaJNI.dual_text_options_t_margin_set(swigCPtr, this, value);
  }

  public int getMargin() {
    return IdaJavaJNI.dual_text_options_t_margin_get(swigCPtr, this);
  }

  public void setBinSize(int value) {
    IdaJavaJNI.dual_text_options_t_binSize_set(swigCPtr, this, value);
  }

  public int getBinSize() {
    return IdaJavaJNI.dual_text_options_t_binSize_get(swigCPtr, this);
  }

  public dual_text_options_t(boolean for_graph) {
    this(IdaJavaJNI.new_dual_text_options_t__SWIG_0(for_graph), true);
  }

  public dual_text_options_t(idainfo inf) {
    this(IdaJavaJNI.new_dual_text_options_t__SWIG_1(idainfo.getCPtr(inf), inf), true);
  }

}
