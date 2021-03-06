package org.mondo.collaboration.client.incquery.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.client.incquery.TeacherWithoutClassMatch;
import org.mondo.collaboration.client.incquery.TeacherWithoutClassMatcher;
import org.mondo.collaboration.client.incquery.util.ClassesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TeacherWithoutClassMatcher in a type-safe way.
 * 
 * @see TeacherWithoutClassMatcher
 * @see TeacherWithoutClassMatch
 * 
 */
@SuppressWarnings("all")
public final class TeacherWithoutClassQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeacherWithoutClassMatcher> {
  private TeacherWithoutClassQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeacherWithoutClassQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeacherWithoutClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeacherWithoutClassMatcher.on(engine);
  }
  
  @Override
  public TeacherWithoutClassMatch newEmptyMatch() {
    return TeacherWithoutClassMatch.newEmptyMatch();
  }
  
  @Override
  public TeacherWithoutClassMatch newMatch(final Object... parameters) {
    return TeacherWithoutClassMatch.newMatch((school.Teacher) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TeacherWithoutClassQuerySpecification INSTANCE = make();
    
    public static TeacherWithoutClassQuerySpecification make() {
      return new TeacherWithoutClassQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeacherWithoutClassQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.client.incquery.teacherWithoutClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "school.Teacher"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var__SC = body.getOrCreateVariableByName("_SC");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T")
      	));
      	new TypeUnary(body, var_T, getClassifierLiteral("http://school.ecore", "Teacher"), "http://school.ecore/Teacher");
      	new NegativePatternCall(body, new FlatTuple(var_T, var__SC), ClassesOfTeacherQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
