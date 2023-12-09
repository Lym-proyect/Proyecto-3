// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Quiz202320.gold"
import gold.structures.automaton.*;
import gold.structures.map.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Quiz202320 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=7;
      Object c=$fix(Quiz202320.createCoder());
      $line=8;
      Object d=$fix(Quiz202320.createDecoder());
      $line=9;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,c),$cast(gold.structures.automaton.ITransducer.class,d));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=18;
      Object Q=$fix($opUnionY(GCollections.asSet("I","F","E"),$opCartsY(new Object[]{$opIntvlY('a','z'),$opIntvlY(0,2)})));
      $line=20;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ','$')));
      $line=21;
      Object Out=$fix($opUnionY($opUnionY($opIntvlY('0','2'),$opIntvlY('a','z')),GCollections.asSet('$','*')));
      $line=23;
      Object q_0=$fix("I");
      $line=24;
      Object F=$fix(GCollections.asSet("F"));
      $line=25;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Quiz202320.class,"\u03B4"),new GMethod(Quiz202320.class,"g"),new GMethod(Quiz202320.class,"h")});
      if (true) break $try;
      $line=26;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=30;
      Object Q=$fix($opUnionY($opUnionY(GCollections.asSet("I","F","E"),$opCartsY(new Object[]{$opIntvlY('a','z'),$opIntvlY(0,2)})),GCollections.asSet('$','*')));
      $line=31;
      Object In=$fix($opUnionY($opUnionY($opIntvlY('0','2'),$opIntvlY('a','z')),GCollections.asSet('$','*')));
      $line=32;
      Object Out=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ','$')));
      $line=33;
      Object q_0=$fix("I");
      $line=34;
      Object F=$fix(GCollections.asSet("F"));
      $line=35;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,In,Out,q_0,F,new GMethod(Quiz202320.class,"\u03B41"),new GMethod(Quiz202320.class,"g1"),new GMethod(Quiz202320.class,"h1")});
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=41;
      if (($opEqualY(q,"I")&&$opEqualY(s,'$'))) {
        $line=41;
        $result="F";
        if (true) break $try;
      }
      else {
        $line=42;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=42;
          $result=GCollections.asList(s,0);
          if (true) break $try;
        }
        else {
          $line=43;
          $result="E";
          if (true) break $try;
        }
      }
      $line=46;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object first=$v2.next();
      Object count=$v2.next();
      $line=49;
      if ($opEqualY(s,'$')) {
        $line=49;
        $result="F";
        if (true) break $try;
      }
      else {
        $line=51;
        if ($opEqualY(s,' ')) {
          $line=51;
          $result="I";
          if (true) break $try;
        }
        else {
          $line=54;
          if ($opEqualY(s,first)) {
            $line=54;
            $result=GCollections.asList(first,$opModulY($opAdditY(count,1),3));
            if (true) break $try;
          }
          else {
            $line=55;
            $result=GCollections.asList(first,count);
            if (true) break $try;
          }
        }
      }
      $line=58;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8first,count\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=61;
      if (($opEqualY(q,"I")&&$opEqualY(s,'$'))) {
        $line=61;
        $result=s;
        if (true) break $try;
      }
      else {
        $line=62;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=62;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=63;
          $result="";
          if (true) break $try;
        }
      }
      $line=66;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object first=$v4.next();
      Object count=$v4.next();
      $line=69;
      if ($opEqualY(s,'$')) {
        $line=69;
        $result=$opAdditY($opAdditY("",count),"$");
        if (true) break $try;
      }
      else {
        $line=71;
        if ($opEqualY(s,' ')) {
          $line=71;
          $result=$opAdditY("",count);
          if (true) break $try;
        }
        else {
          $line=74;
          if ($opEqualY(s,first)) {
            $line=74;
            $result="*";
            if (true) break $try;
          }
          else {
            $line=75;
            $result=s;
            if (true) break $try;
          }
        }
      }
      $line=78;
      $rethrow(new RuntimeException("The function \"h(\u27E8first,count\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=81;
      $result="";
      if (true) break $try;
      $line=82;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"g",$line);
    }
    return $result;
  }
  public static Object g1(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=85;
      $result="";
      if (true) break $try;
      $line=86;
      $rethrow(new RuntimeException("The function \"g1(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"g1",$line);
    }
    return $result;
  }
  public static Object \u03B41(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=91;
      if (($opEqualY(q,"I")&&$opEqualY(s,'$'))) {
        $line=91;
        $result="F";
        if (true) break $try;
      }
      else {
        $line=93;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=93;
          $result=GCollections.asList(s,0);
          if (true) break $try;
        }
        else {
          $line=95;
          $result="E";
          if (true) break $try;
        }
      }
      $line=99;
      $rethrow(new RuntimeException("The function \"\u03B41(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v5, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object first=$v6.next();
      Object count=$v6.next();
      $line=103;
      if ($opEqualY(s,'$')) {
        $line=103;
        $result="F";
        if (true) break $try;
      }
      else {
        $line=105;
        if ($opMembrY(s,$opIntvlY('0','2'))) {
          $line=105;
          $result="I";
          if (true) break $try;
        }
        else {
          $line=107;
          if ($opEqualY(s,first)) {
            $line=107;
            $result=GCollections.asList(first,count);
            if (true) break $try;
          }
          else {
            $line=109;
            $result=GCollections.asList(first,count);
            if (true) break $try;
          }
        }
      }
      $line=113;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8first,count\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=119;
      if (($opEqualY(q,"I")&&$opEqualY(s,'$'))) {
        $line=119;
        $result=s;
        if (true) break $try;
      }
      else {
        $line=121;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=121;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=123;
          if ($opMembrY(q,$opIntvlY('a','z'))) {
            $line=123;
            $result=q;
            if (true) break $try;
          }
          else {
            $line=125;
            if (($opMembrY(q,$opIntvlY('0','2'))&&!$opEqualY(s,"$"))) {
              $line=125;
              $result=" ";
              if (true) break $try;
            }
            else {
              $line=127;
              if (($opMembrY(q,$opIntvlY('0','2'))&&$opEqualY(s,"$"))) {
                $line=127;
                $result="";
                if (true) break $try;
              }
              else {
                $line=129;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=132;
      $rethrow(new RuntimeException("The function \"h1(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v7, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v8=GCollections.unmodifiableCollection($v7).iterator();
      Object first=$v8.next();
      Object count=$v8.next();
      $line=136;
      if ($opEqualY(s,'*')) {
        $line=136;
        $result=first;
        if (true) break $try;
      }
      else {
        $line=137;
        if ($opMembrY(s,$opIntvlY('a','z'))) {
          $line=137;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=138;
          if ($opMembrY(s,$opIntvlY('0','2'))) {
            $line=138;
            $result=" ";
            if (true) break $try;
          }
          else {
            $line=140;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=143;
      $rethrow(new RuntimeException("The function \"h1(\u27E8first,count\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Quiz202320.class,"h1",$line);
    }
    return $result;
  }
}