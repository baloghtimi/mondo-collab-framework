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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.mondo.collaboration.client.incquery.TeachersOfSchoolNamesMatch;
import org.mondo.collaboration.client.incquery.TeachersOfSchoolNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolNamesMatcher
 * @see TeachersOfSchoolNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersOfSchoolNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeachersOfSchoolNamesMatcher> {
  private TeachersOfSchoolNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeachersOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolNamesMatcher.on(engine);
  }
  
  @Override
  public TeachersOfSchoolNamesMatch newEmptyMatch() {
    return TeachersOfSchoolNamesMatch.newEmptyMatch();
  }
  
  @Override
  public TeachersOfSchoolNamesMatch newMatch(final Object... parameters) {
    return TeachersOfSchoolNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TeachersOfSchoolNamesQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolNamesQuerySpecification make() {
      return new TeachersOfSchoolNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeachersOfSchoolNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.client.incquery.teachersOfSchoolNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("TName","SName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("SName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_TName = body.getOrCreateVariableByName("TName");
      	PVariable var_SName = body.getOrCreateVariableByName("SName");
      	PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_TName, "TName"),
      				
      		new ExportedParameter(body, var_SName, "SName")
      	));
      	new TypeBinary(body, CONTEXT, var_Sch, var_T, getFeatureLiteral("http://school.ecore", "School", "teachers"), "http://school.ecore/School.teachers");
      	new TypeBinary(body, CONTEXT, var_Sch, var_SName, getFeatureLiteral("http://school.ecore", "School", "name"), "http://school.ecore/School.name");
      	new TypeBinary(body, CONTEXT, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
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
