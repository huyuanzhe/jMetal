//  BinaryTournamentTest.java
//
//  Author:
//       Antonio J. Nebro <antonio@lcc.uma.es>
//
//  Copyright (c) 2014 Antonio J. Nebro
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.uma.jmetal.operator.selection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.uma.jmetal.operator.impl.selection.BinaryTournamentSelection;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.solution.Solution;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Antonio J. Nebro on 15/06/14.
 */
public class BinaryTournamentSelectionTest {
  static final int POPULATION_SIZE = 20 ;

  private BinaryTournamentSelection selection ;
  private Problem problem ;
  private List<Solution> population ;

  @Before
  public void startup() throws ClassNotFoundException {
    problem = Mockito.mock(Problem.class) ;
    selection = new BinaryTournamentSelection() ;

    population = new ArrayList<>(POPULATION_SIZE) ;
    for (int i = 0 ; i < POPULATION_SIZE; i++) {
      population.add(problem.createSolution()) ;
    }
  }

  @Test
  public void emptyTest() {

  }
/*
  @Test
  public void executeWithCorrectParametersTest() {
    assertNotNull(selection.execute(population));
  }

  @Test
  public void executeWithCorrectPopulationSizeOneTest() {
    population = new ArrayList<>(1) ;
    Solution solution = problem.createSolution() ;
    population.add(solution) ;
    assertEquals(solution, selection.run(population));
  }

  @Test (expected = JMetalException.class)
  public void executeWithPopulationSizeZeroTest() {
    population = new ArrayList<>(1) ;
    selection.run(population) ;
  }

  @Test
  public void executeWithSolutionSetSizeTwoTest() throws ClassNotFoundException {
    population = new ArrayList<>(2) ;
    population.add(problem.createSolution()) ;
    population.add(problem.createSolution()) ;
    assertNotNull(selection.run(population));
  }

  @Test (expected = JMetalException.class)
  public void nullParameterTest() {
    selection.run(null) ;
  }

  @After
  public void tearDown() {
    selection = null ;
    population = null ;
    problem = null ;
  }
  */
}
