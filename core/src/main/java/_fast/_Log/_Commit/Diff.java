// automatically generated by the FlatBuffers compiler, do not modify

package _fast._Log._Commit;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Diff extends Table {
  public static Diff getRootAsDiff(ByteBuffer _bb) { return getRootAsDiff(_bb, new Diff()); }
  public static Diff getRootAsDiff(ByteBuffer _bb, Diff obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Diff __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String a() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer aAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String b() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public boolean isNew() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String isCode() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer isCodeAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String indexFrom() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer indexFromAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public String indexTo() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer indexToAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public String mode() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer modeAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public _fast._Log._Commit._Diff.Hunk hunk(int j) { return hunk(new _fast._Log._Commit._Diff.Hunk(), j); }
  public _fast._Log._Commit._Diff.Hunk hunk(_fast._Log._Commit._Diff.Hunk obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int hunkLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }

  public static int createDiff(FlatBufferBuilder builder,
      int aOffset,
      int bOffset,
      boolean is_new,
      int is_codeOffset,
      int index_fromOffset,
      int index_toOffset,
      int modeOffset,
      int hunkOffset) {
    builder.startObject(8);
    Diff.addHunk(builder, hunkOffset);
    Diff.addMode(builder, modeOffset);
    Diff.addIndexTo(builder, index_toOffset);
    Diff.addIndexFrom(builder, index_fromOffset);
    Diff.addIsCode(builder, is_codeOffset);
    Diff.addB(builder, bOffset);
    Diff.addA(builder, aOffset);
    Diff.addIsNew(builder, is_new);
    return Diff.endDiff(builder);
  }

  public static void startDiff(FlatBufferBuilder builder) { builder.startObject(8); }
  public static void addA(FlatBufferBuilder builder, int aOffset) { builder.addOffset(0, aOffset, 0); }
  public static void addB(FlatBufferBuilder builder, int bOffset) { builder.addOffset(1, bOffset, 0); }
  public static void addIsNew(FlatBufferBuilder builder, boolean isNew) { builder.addBoolean(2, isNew, false); }
  public static void addIsCode(FlatBufferBuilder builder, int isCodeOffset) { builder.addOffset(3, isCodeOffset, 0); }
  public static void addIndexFrom(FlatBufferBuilder builder, int indexFromOffset) { builder.addOffset(4, indexFromOffset, 0); }
  public static void addIndexTo(FlatBufferBuilder builder, int indexToOffset) { builder.addOffset(5, indexToOffset, 0); }
  public static void addMode(FlatBufferBuilder builder, int modeOffset) { builder.addOffset(6, modeOffset, 0); }
  public static void addHunk(FlatBufferBuilder builder, int hunkOffset) { builder.addOffset(7, hunkOffset, 0); }
  public static int createHunkVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startHunkVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endDiff(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

