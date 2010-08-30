/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class areacb_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public areacb_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(areacb_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_areacb_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void zero() {
    IdaJavaJNI.areacb_t_zero(swigCPtr, this);
  }

  public areacb_t() {
    this(IdaJavaJNI.new_areacb_t(), true);
  }

  public void terminate() {
    IdaJavaJNI.areacb_t_terminate(swigCPtr, this);
  }

  public void save() {
    IdaJavaJNI.areacb_t_save(swigCPtr, this);
  }

  public boolean link(String file, String name, int infosize) {
    return IdaJavaJNI.areacb_t_link(swigCPtr, this, file, name, infosize);
  }

  public boolean create(String file, String name, long infosize) {
    return IdaJavaJNI.areacb_t_create(swigCPtr, this, file, name, infosize);
  }

  public void kill() {
    IdaJavaJNI.areacb_t_kill(swigCPtr, this);
  }

  public boolean create_area(area_t info) {
    return IdaJavaJNI.areacb_t_create_area(swigCPtr, this, area_t.getCPtr(info), info);
  }

  public boolean update(area_t info) {
    return IdaJavaJNI.areacb_t_update(swigCPtr, this, area_t.getCPtr(info), info);
  }

  public area_t get_area(long ea) {
    long cPtr = IdaJavaJNI.areacb_t_get_area(swigCPtr, this, ea);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public area_t getn_area(long n) {
    long cPtr = IdaJavaJNI.areacb_t_getn_area(swigCPtr, this, n);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public int get_area_num(long ea) {
    return IdaJavaJNI.areacb_t_get_area_num(swigCPtr, this, ea);
  }

  public long prepare_to_create(long start, long end) {
    return IdaJavaJNI.areacb_t_prepare_to_create(swigCPtr, this, start, end);
  }

  public int get_next_area(long ea) {
    return IdaJavaJNI.areacb_t_get_next_area(swigCPtr, this, ea);
  }

  public int get_prev_area(long ea) {
    return IdaJavaJNI.areacb_t_get_prev_area(swigCPtr, this, ea);
  }

  public area_t next_area_ptr(long ea) {
    long cPtr = IdaJavaJNI.areacb_t_next_area_ptr(swigCPtr, this, ea);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public area_t prev_area_ptr(long ea) {
    long cPtr = IdaJavaJNI.areacb_t_prev_area_ptr(swigCPtr, this, ea);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public area_t first_area_ptr() {
    long cPtr = IdaJavaJNI.areacb_t_first_area_ptr(swigCPtr, this);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public area_t last_area_ptr() {
    long cPtr = IdaJavaJNI.areacb_t_last_area_ptr(swigCPtr, this);
    return (cPtr == 0) ? null : new area_t(cPtr, false);
  }

  public boolean del_area(long ea, boolean delcmt) {
    return IdaJavaJNI.areacb_t_del_area__SWIG_0(swigCPtr, this, ea, delcmt);
  }

  public boolean del_area(long ea) {
    return IdaJavaJNI.areacb_t_del_area__SWIG_1(swigCPtr, this, ea);
  }

  public boolean may_start_at(long n, long newstart) {
    return IdaJavaJNI.areacb_t_may_start_at(swigCPtr, this, n, newstart);
  }

  public boolean may_end_at(long n, long newend) {
    return IdaJavaJNI.areacb_t_may_end_at(swigCPtr, this, n, newend);
  }

  public boolean set_start(long n, long newstart) {
    return IdaJavaJNI.areacb_t_set_start(swigCPtr, this, n, newstart);
  }

  public boolean set_end(long n, long newend) {
    return IdaJavaJNI.areacb_t_set_end(swigCPtr, this, n, newend);
  }

  public void make_hole(long ea1, long ea2, boolean create_tail_area) {
    IdaJavaJNI.areacb_t_make_hole(swigCPtr, this, ea1, ea2, create_tail_area);
  }

  public boolean resize_areas(long n, long newstart) {
    return IdaJavaJNI.areacb_t_resize_areas(swigCPtr, this, n, newstart);
  }

  public long get_area_qty() {
    return IdaJavaJNI.areacb_t_get_area_qty(swigCPtr, this);
  }

  public boolean set_area_cmt(area_t a, String cmt, boolean repeatable) {
    return IdaJavaJNI.areacb_t_set_area_cmt(swigCPtr, this, area_t.getCPtr(a), a, cmt, repeatable);
  }

  public void del_area_cmt(area_t a, boolean repeatable) {
    IdaJavaJNI.areacb_t_del_area_cmt(swigCPtr, this, area_t.getCPtr(a), a, repeatable);
  }

  public String get_area_cmt(area_t a, boolean repeatable) {
    return IdaJavaJNI.areacb_t_get_area_cmt(swigCPtr, this, area_t.getCPtr(a), a, repeatable);
  }

  public int for_all_areas2(long ea1, long ea2, area_visitor2_t av) {
    return IdaJavaJNI.areacb_t_for_all_areas2(swigCPtr, this, ea1, ea2, area_visitor2_t.getCPtr(av), av);
  }

}
