// automatically generated by the FlatBuffers compiler, do not modify

package _fast._Slices._Slice._SourceFile._Function._Variable;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FunctionDecl extends Table {
  public static FunctionDecl getRootAsFunctionDecl(ByteBuffer _bb) { return getRootAsFunctionDecl(_bb, new FunctionDecl()); }
  public static FunctionDecl getRootAsFunctionDecl(ByteBuffer _bb, FunctionDecl obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FunctionDecl __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String location() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer locationAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createFunctionDecl(FlatBufferBuilder builder,
      int nameOffset,
      int locationOffset) {
    builder.startObject(2);
    FunctionDecl.addLocation(builder, locationOffset);
    FunctionDecl.addName(builder, nameOffset);
    return FunctionDecl.endFunctionDecl(builder);
  }

  public static void startFunctionDecl(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addLocation(FlatBufferBuilder builder, int locationOffset) { builder.addOffset(1, locationOffset, 0); }
  public static int endFunctionDecl(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

