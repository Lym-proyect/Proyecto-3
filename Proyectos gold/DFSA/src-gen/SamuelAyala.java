// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/SamuelAyala.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class SamuelAyala {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=6;
      Object c=$fix(SamuelAyala.createCoder());
      $line=7;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,c));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=13;
      Object estado=$fix($opUnionY($opIntvlY(0,100),GCollections.asSet('2','3','5')));
      $line=16;
      Object Q=$fix($opUnionY($opCartsY(new Object[]{estado,estado,estado,estado}),GCollections.asSet("E","I","F")));
      $line=17;
      Object \u03A3=$fix(GCollections.asSet('2','3','5','\u00D7','q','r','x','=','+','\u00F7',""));
      $line=18;
      Object Out=$fix($opUnionY(GCollections.asSet("_"),$opIntvlY('a','z')));
      $line=19;
      Object q_0=$fix("I");
      $line=20;
      Object F=$fix(Q);
      $line=21;
      Object M=$fix($invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(SamuelAyala.class,"\u03B4"),new GMethod(SamuelAyala.class,"g"),new GMethod(SamuelAyala.class,"h")}));
      $line=22;
      $result=M;
      if (true) break $try;
      $line=23;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=28;
      Object alfabeto=$fix(GCollections.asSet('2','3','5','\u00D7','q','x','=','+','\u00F7'));
      $line=29;
      Object N=$fix(0);
      $line=30;
      Object Q=$fix(0);
      $line=31;
      Object R=$fix(0);
      $line=32;
      Object D=$fix("");
      $line=34;
      if (($opEqualY(q,"I")&&$opMembrY(s,alfabeto))) {
        $line=34;
        $result=GCollections.asList($opEqualY(N,$opAdditY(N,1)),"","");
        if (true) break $try;
      }
      else {
        $line=36;
        if (($opEqualY(q,'x')&&$opMembrY(s,alfabeto))) {
          $line=36;
          $result=GCollections.asList($opEqualY(N,$opAdditY(N,1)),"","");
          if (true) break $try;
        }
        else {
          $line=38;
          if (($opEqualY(q,'q')&&$opMembrY(s,alfabeto))) {
            $line=38;
            $result=GCollections.asList(N,$opEqualY(Q,$opAdditY(Q,1)),"");
            if (true) break $try;
          }
          else {
            $line=40;
            if ((($opEqualY(q,'2')||$opEqualY(q,'3'))||$opEqualY(q,'5'))) {
              $line=40;
              $result=GCollections.asList(N,Q,"",$opEqualY(D,q));
              if (true) break $try;
            }
            else {
              $line=42;
              if (($opEqualY(q,'r')&&$opEqualY(s,""))) {
                $line=42;
                $result=GCollections.asList(N,Q,$opEqualY(R,$opAdditY(R,1)),D);
                if (true) break $try;
              }
              else {
                $line=44;
                if (($opEqualY(q,'r')&&$opEqualY(s,'r'))) {
                  $line=44;
                  $result=GCollections.asList(N,Q,$opEqualY(R,$opAdditY(R,1)),D);
                  if (true) break $try;
                }
                else {
                  $line=46;
                  $result="E";
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=49;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object N=$v2.next();
      Object Q=$v2.next();
      Object R=$v2.next();
      Object D=$v2.next();
      $line=53;
      Object w=$fix(false);
      $line=54;
      Object i=$fix(0);
      $line=55;
      Object cont=$fix(0);
      $line=56;
      Object r=$fix(0);
      $line=57;
      Object estado=$fix($opIntvlY(0,100));
      $line=58;
      Q=$fix($opUnionY($opCartsY(new Object[]{estado,estado,estado,estado}),GCollections.asSet("E","I","F")));
      $line=59;
      Object \u03A3=$fix(GCollections.asSet('2','3','5','\u00D7','q','r','x','=','+','\u00F7',""));
      $line=60;
      Object Out=$fix($opUnionY(GCollections.asSet("_"),$opIntvlY('a','z')));
      $line=61;
      Object q_0=$fix("I");
      $line=62;
      Object F=$fix(Q);
      $line=63;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,Out,q_0,F}));
      $line=65;
      if ((($opEqualY(Q,"")||$opEqualY(D,""))||$opEqualY(R,""))) {
        $line=65;
        $result=s;
        if (true) break $try;
      }
      else {
        $line=67;
        if ($opEqualY(s,'q')) {
          $line=67;
          $result=s;
          if (true) break $try;
          $line=69;
          while (true) {
            if (!((($opLessqY(i,N)&&!$opEqualY(N,0))&&!$opEqualY(N,"")))) break;
            $line=70;
            $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta('x','x',$cast(java.lang.String.class,'x')),new Object[]{"x"});
            $line=71;
            i=$fix($opAdditY(i,1));
          }
        }
        else {
          $line=74;
          if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta('x','\u00F7',$cast(java.lang.String.class,'\u00F7')),new Object[]{"x"}))) {
            $line=76;
            $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00F7"});
          }
          else {
            $line=78;
            if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta('\u00F7',D,$cast(java.lang.String.class,D)),new Object[]{"\u00F7"}))) {
              $line=80;
              $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))});
            }
            else {
              $line=82;
              if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta(D,'=',$cast(java.lang.String.class,'=')),new Object[]{D}))) {
                $line=84;
                $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{"="});
              }
              else {
                $line=86;
                if ($opEqualY($opDividY(N,Integer.parseInt($cast(java.lang.String.class,$invokeMethod(String.class,"valueOf",true,null,new Object[]{D})))),Q)) {
                  $line=87;
                  while (true) {
                    if (!((($opLessqY(cont,Q)&&!$opEqualY(Q,0))&&!$opEqualY(Q,"")))) break;
                    $line=88;
                    $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta('=','q',$cast(java.lang.String.class,'q')),new Object[]{"q"});
                    $line=89;
                    cont=$fix($opAdditY(cont,1));
                  }
                }
                else {
                  $line=92;
                  if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("q",'\u00D7',$cast(java.lang.String.class,'\u00D7')),new Object[]{"q"}))) {
                    $line=94;
                    $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00D7"});
                  }
                  else {
                    $line=96;
                    if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("\u00D7",D,$cast(java.lang.String.class,D)),new Object[]{"\u00D7"}))) {
                      $line=98;
                      $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))});
                    }
                    else {
                      $line=100;
                      if ($bool($invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta(D,'+',$cast(java.lang.String.class,'+')),new Object[]{D}))) {
                        $line=102;
                        $invokeMethod("push",$invokeMethod("delta",M,new Object[]{}),new Object[]{"+"});
                      }
                      else {
                        $line=104;
                        if ($opEqualY($opModulY(N,Integer.parseInt($cast(java.lang.String.class,$invokeMethod(String.class,"valueOf",true,null,new Object[]{D})))),R)) {
                          $line=105;
                          while (true) {
                            if (!((($opLessqY(r,R)&&!$opEqualY(R,0))&&!$opEqualY(R,"")))) break;
                            $line=106;
                            $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("+",'r',$cast(java.lang.String.class,'r')),new Object[]{"r"});
                            $line=107;
                            r=$fix($opAdditY(r,1));
                          }
                        }
                        else {
                          $line=110;
                          if (($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"r"}))&&$opGreatY(r,0))) {
                            $line=112;
                            while (true) {
                              if (!($opGreatY(r,0))) break;
                              $line=113;
                              $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"r"});
                              $line=114;
                              r=$fix($opSubtrY(r,1));
                            }
                            $line=117;
                            if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"+"}))) {
                              $line=118;
                              $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"+"});
                            }
                            else {
                              $line=120;
                              if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))}))) {
                                $line=121;
                                $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))});
                              }
                              else {
                                $line=123;
                                if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00D7"}))) {
                                  $line=124;
                                  $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00D7"});
                                }
                                else {
                                  $line=126;
                                  if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"q"}))) {
                                    $line=127;
                                    while (true) {
                                      if (!($opGreatY(cont,0))) break;
                                      $line=128;
                                      $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"q"});
                                      $line=129;
                                      cont=$fix($opSubtrY(cont,1));
                                    }
                                  }
                                  else {
                                    $line=132;
                                    if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"="}))) {
                                      $line=133;
                                      $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"="});
                                    }
                                    else {
                                      $line=135;
                                      if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))}))) {
                                        $line=136;
                                        $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))});
                                      }
                                      else {
                                        $line=138;
                                        if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00F7"}))) {
                                          $line=139;
                                          $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00F7"});
                                          $line=140;
                                          if (($opEqualY(i,0)&&$bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{""})))) {
                                            $line=141;
                                            w=$fix(true);
                                          }
                                          else {
                                            $line=142;
                                            $result=w;
                                            if (true) break $try;
                                          }
                                        }
                                        else {
                                          $line=145;
                                          if ($opGreatY(i,0)) {
                                            $line=146;
                                            while (true) {
                                              if (!($opGreatY(i,0))) break;
                                              $line=147;
                                              $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"x"});
                                              $line=148;
                                              i=$fix($opSubtrY(i,1));
                                            }
                                          }
                                          else {
                                            $line=151;
                                            if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{""}))) {
                                              $line=152;
                                              w=$fix(true);
                                            }
                                            else {
                                              $line=154;
                                              $result=w;
                                              if (true) break $try;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            $line=157;
                            if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))}))) {
                              $line=158;
                              $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{Character.toString($cast(char.class,D))});
                            }
                            else {
                              $line=160;
                              if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00F7"}))) {
                                $line=161;
                                $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"\u00F7"});
                                $line=162;
                                if (($opEqualY(i,0)&&$bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{""})))) {
                                  $line=163;
                                  w=$fix(true);
                                }
                                else {
                                  $line=164;
                                  $result=w;
                                  if (true) break $try;
                                }
                              }
                              else {
                                $line=167;
                                if ($opGreatY(i,0)) {
                                  $line=168;
                                  while (true) {
                                    if (!($opGreatY(i,0))) break;
                                    $line=169;
                                    $invokeMethod("pop",$invokeMethod("delta",M,new Object[]{}),new Object[]{"x"});
                                    $line=170;
                                    i=$fix($opSubtrY(i,1));
                                  }
                                }
                                else {
                                  $line=173;
                                  if ($bool($invokeMethod("skip",$invokeMethod("delta",M,new Object[]{}),new Object[]{""}))) {
                                    $line=174;
                                    w=$fix(true);
                                  }
                                  else {
                                    $line=176;
                                    $result=w;
                                    if (true) break $try;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=179;
      $result=w;
      if (true) break $try;
      $line=181;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8N,Q,R,D\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=185;
      if ($opEqualY(q,true)) {
        $line=185;
        $result="La_cadena_pertenece_al_lenguaje";
        if (true) break $try;
      }
      else {
        $line=187;
        $result="La_cadena_NO_pertence_al_lenguaje";
        if (true) break $try;
      }
      $line=190;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object N=$v4.next();
      Object Q=$v4.next();
      Object R=$v4.next();
      Object D=$v4.next();
      $line=194;
      $result="";
      if (true) break $try;
      $line=196;
      $rethrow(new RuntimeException("The function \"h(\u27E8N,Q,R,D\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=199;
      $result="";
      if (true) break $try;
      $line=200;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,SamuelAyala.class,"g",$line);
    }
    return $result;
  }
}