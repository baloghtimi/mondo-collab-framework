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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.client.incquery.FinalPattern2Match;
import org.mondo.collaboration.client.incquery.FinalPattern2Matcher;
import org.mondo.collaboration.client.incquery.util.TeachesTheMostCoursesQuerySpecification;
import org.mondo.collaboration.client.incquery.util.TheOnesWithTheBiggestCircleQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FinalPattern2Matcher in a type-safe way.
 * 
 * @see FinalPattern2Matcher
 * @see FinalPattern2Match
 * 
 */
@SuppressWarnings("all")
public final class FinalPattern2QuerySpecification extends BaseGeneratedEMFQuerySpecification<FinalPattern2Matcher> {
  private FinalPattern2QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPattern2QuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FinalPattern2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FinalPattern2Matcher.on(engine);
  }
  
  @Override
  public FinalPattern2Match newEmptyMatch() {
    return FinalPattern2Match.newEmptyMatch();
  }
  
  @Override
  public FinalPattern2Match newMatch(final Object... parameters) {
    return FinalPattern2Match.newMatch((java.lang.Integer) parameters[0], (java.lang.String) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static FinalPattern2QuerySpecification INSTANCE = make();
    
    public static FinalPattern2QuerySpecification make() {
      return new FinalPattern2QuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FinalPattern2QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.client.incquery.finalPattern2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("YDate","CSub","TName","SName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("YDate", "java.lang.Integer"),new PParameter("CSub", "java.lang.String"),new PParameter("TName", "java.lang.String"),new PParameter("SName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_YDate = body.getOrCreateVariableByName("YDate");
      	PVariable var_CSub = body.getOrCreateVariableByName("CSub");
      	PVariable var_TName = body.getOrCreateVariableByName("TName");
      	PVariable var_SName = body.getOrCreateVariableByName("SName");
      	PVariable var_Y = body.getOrCreateVariableByName("Y");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_YDate, "YDate"),
      				
      		new ExportedParameter(body, var_CSub, "CSub"),
      				
      		new ExportedParameter(body, var_TName, "TName"),
      				
      		new ExportedParameter(body, var_SName, "SName")
      	));
      	new TypeBinary(body, CONTEXT, var_Y, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Year", "schoolClasses"), "http://school.ecore/Year.schoolClasses");
      	new TypeBinary(body, CONTEXT, var__virtual_0_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      	new TypeBinary(body, CONTEXT, var_C, var_T, getFeatureLiteral("http://school.ecore", "Course", "teacher"), "http://school.ecore/Course.teacher");
      	new TypeBinary(body, CONTEXT, var_S, var__virtual_3_, getFeatureLiteral("http://school.ecore", "Student", "schoolClass"), "http://school.ecore/Student.schoolClass");
      	new TypeBinary(body, CONTEXT, var__virtual_3_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      	new PositivePatternCall(body, new FlatTuple(var_S), TheOnesWithTheBiggestCircleQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_T), TeachesTheMostCoursesQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeBinary(body, CONTEXT, var_Y, var_YDate, getFeatureLiteral("http://school.ecore", "Year", "startingDate"), "http://school.ecore/Year.startingDate");
      	new TypeBinary(body, CONTEXT, var_C, var_CSub, getFeatureLiteral("http://school.ecore", "Course", "subject"), "http://school.ecore/Course.subject");
      	new TypeBinary(body, CONTEXT, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      	new TypeBinary(body, CONTEXT, var_S, var_SName, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("QueryExplorer");
      	annotation.addAttribute("display", true);
      	annotation.addAttribute("message", "The busiest teacher $TName$ taught the most sociable student $SName$ in $YDate$");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "YDate");
      	annotation.addAttribute("name", "Year");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "TName");
      	annotation.addAttribute("name", "Teacher");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "SName");
      	annotation.addAttribute("name", "Student");
      	addAnnotation(annotation);
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
