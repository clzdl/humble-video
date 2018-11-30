/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Decodes MediaPacket objects into MediaAudio, MediaPicture or MediaSubtitle objects.
 */
public class Decoder extends Coder {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Decoder(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.Decoder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Decoder(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.Decoder_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Decoder obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Decoder object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Decoder copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Decoder(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Decoder)
      equal = (((Decoder)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Create a Decoder that will use the given Codec.<br>
 * <br>
 * @return a Decoder<br>
 * @throws InvalidArgument if codec is null or codec cannot decode.
 */
  public static Decoder make(Codec codec) {
    long cPtr = VideoJNI.Decoder_make__SWIG_0(Codec.getCPtr(codec), codec);
    return (cPtr == 0) ? null : new Decoder(cPtr, false);
  }

/**
 * Creates a Decoder, copying parameters from a given Coder (either an encoder or a decoder).<br>
 * @return a Decoder<br>
 * @throws InvalidArgument if src is null
 */
  public static Decoder make(Coder src) {
    long cPtr = VideoJNI.Decoder_make__SWIG_1(Coder.getCPtr(src), src);
    return (cPtr == 0) ? null : new Decoder(cPtr, false);
  }

/**
 * Send a packet to the decoder for processing.<br>
 * <p><br>
 * If the packet is not null it must be complete, and it is up to<br>
 * the caller to ensure the Packet is valid (e.g. send a video packet<br>
 * to a video decoder) for this Decoder. Otherwise exceptions shall<br>
 * be thrown. If null, this instructs the Decoder to start flushing<br>
 * any saved data (and usually means no more data shall come).<br>
 * </p><br>
 * <p><br>
 * If ProcessorResult.RESULT_AWAITING_DATA is returned, then<br>
 * the internal buffers may be full, and #receiveRaw(MediaRaw)<br>
 * should be called to process some data.<br>
 * </p><br>
 * <br>
 * @param packet The packet. If null, the Decoder should flush any data.<br>
 * <br>
 * @return The ProcessorResult.<br>
 * @see #sendEncoded
 */
  public ProcessorResult sendPacket(MediaPacket packet) {
    return ProcessorResult.swigToEnum(VideoJNI.Decoder_sendPacket(swigCPtr, this, MediaPacket.getCPtr(packet), packet));
  }

  public ProcessorResult sendEncoded(MediaEncoded media) {
    return ProcessorResult.swigToEnum(VideoJNI.Decoder_sendEncoded(swigCPtr, this, MediaEncoded.getCPtr(media), media));
  }

/**
 * Decode data into this output.<br>
 * <p><br>
 * The caller is responsible for allocating the<br>
 * correct underlying Media object.  This function will overwrite<br>
 * any data in the output object.<br>
 * </p><br>
 * <p><br>
 * If ProcessorResult.RESULT_AWAITING_DATA is returned, then<br>
 * the internal buffers may be empty (i.e. we need data), and<br>
 * more data should be passed in via #sendEncoded(MediaEncoded)<br>
 * should be called to add some data.<br>
 * </p><br>
 * <p><br>
 * If ProcessorResult.RESULT_END_OF_STREAM is returned, the Decoder<br>
 * has been flushed and has no more data. If you get more data,<br>
 * you'll need to make a new Decoder.<br>
 * </p><br>
 * @param output The Media we decode to.<br>
 * <br>
 * @return The ProcessorResult<br>
 * <br>
 * @throws InvalidArgument if the media type is not compatible with this decoder.<br>
 * @see #sendPacket
 */
  public ProcessorResult receiveRaw(MediaRaw output) {
    return ProcessorResult.swigToEnum(VideoJNI.Decoder_receiveRaw(swigCPtr, this, MediaRaw.getCPtr(output), output));
  }

}
