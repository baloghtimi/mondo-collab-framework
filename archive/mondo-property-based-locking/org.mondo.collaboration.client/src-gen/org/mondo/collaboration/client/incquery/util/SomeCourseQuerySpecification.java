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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.mondo.collaboration.client.incquery.SomeCourseMatch;
import org.mondo.collaboration.client.incquery.SomeCourseMatcher;

/**
 * A pattern-specific query specification that can instantiate SomeCourseMatcher in a type-safe way.
 * 
 * @see SomeCourseMatcher
 * @see SomeCourseMatch
 * 
 */
@SuppressWarnings("all")
public final class SomeCourseQuerySpecification extends BaseGeneratedEMFQuerySpecification<SomeCourseMatcher> {
  private SomeCourseQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SomeCourseQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SomeCourseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SomeCourseMatcher.on(engine);
  }
  
  @Override
  public SomeCourseMatch newEmptyMatch() {
    return SomeCourseMatch.newEmptyMatch();
  }
  
  @Override
  public SomeCourseMatch newMatch(final Object... parameters) {
    return SomeCourseMatch.newMatch((school.Course) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static SomeCourseQuerySpecification INSTANCE = make();
    
    public static SomeCourseQuerySpecification make() {
      return new SomeCourseQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SomeCourseQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.client.incquery.SomeCourse";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("C");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("C", "school.Course"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "SpecialisationCourse"), "http://school.ecore/SpecialisationCourse");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "LimitedCapacityCourse"), "http://school.ecore/LimitedCapacityCourse");
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
