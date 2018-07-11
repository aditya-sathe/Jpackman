import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Player player9 = null;
        try {
// flaky:             level8.registerPlayer(player9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
// flaky:         level8.stop();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
// flaky:         level8.stop();
        boolean boolean10 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Player player11 = null;
        try {
// flaky:             level8.registerPlayer(player11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList4 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap5 = null;
        nl.tudelft.jpacman.level.Level level6 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, squareList4, collisionMap5);
        java.lang.Class<?> wildcardClass7 = null; // flaky: level6.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver8 = null;
// flaky:         level6.removeObserver(levelObserver8);
// flaky:         level6.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }
}
