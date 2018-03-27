package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Concept extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Concept currentInstance = null;
	private static final Log log = LogFactory.getLog(Concept.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptIterator theConceptIterator = (ConceptIterator) findAncestorWithClass(this, ConceptIterator.class);

			if (theConceptIterator != null) {
				subjectURI = theConceptIterator.getSubjectURI();
				label = theConceptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator theBFO_0000001HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000001HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000001HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator theThingHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator.class);

			if (subjectURI == null && theThingHasSubjectAreaIterator != null) {
				subjectURI = theThingHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator theBFO_0000002HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000002HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000002HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator theBFO_0000031HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000031HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000031HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator theIAO_0000030HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator.class);

			if (subjectURI == null && theIAO_0000030HasSubjectAreaIterator != null) {
				subjectURI = theIAO_0000030HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator theDocumentHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator.class);

			if (subjectURI == null && theDocumentHasSubjectAreaIterator != null) {
				subjectURI = theDocumentHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator theAcademicArticleHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator.class);

			if (subjectURI == null && theAcademicArticleHasSubjectAreaIterator != null) {
				subjectURI = theAcademicArticleHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator theArticleHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator.class);

			if (subjectURI == null && theArticleHasSubjectAreaIterator != null) {
				subjectURI = theArticleHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator theBFO_0000003HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000003HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000003HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator theBFO_0000015HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000015HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000015HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator theEventHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator.class);

			if (subjectURI == null && theEventHasSubjectAreaIterator != null) {
				subjectURI = theEventHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator theBookSectionHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator.class);

			if (subjectURI == null && theBookSectionHasSubjectAreaIterator != null) {
				subjectURI = theBookSectionHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator theChapterHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator.class);

			if (subjectURI == null && theChapterHasSubjectAreaIterator != null) {
				subjectURI = theChapterHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator theConferenceHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator.class);

			if (subjectURI == null && theConferenceHasSubjectAreaIterator != null) {
				subjectURI = theConferenceHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator theDocumentPartHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator.class);

			if (subjectURI == null && theDocumentPartHasSubjectAreaIterator != null) {
				subjectURI = theDocumentPartHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator theBFO_0000001HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000001HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000001HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator theBFO_0000002HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000002HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000002HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator theBFO_0000004HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000004HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000004HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator theThingHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator.class);

			if (subjectURI == null && theThingHasResearchAreaIterator != null) {
				subjectURI = theThingHasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator theAgentHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator.class);

			if (subjectURI == null && theAgentHasResearchAreaIterator != null) {
				subjectURI = theAgentHasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator thePersonHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator.class);

			if (subjectURI == null && thePersonHasResearchAreaIterator != null) {
				subjectURI = thePersonHasResearchAreaIterator.getHasResearchArea();
			}

			if (theConceptIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?Abbreviation where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?Abbreviation } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					abbreviation = sol.get("?Abbreviation") == null ? null : sol.get("?Abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Concept doStartTag", e);
			throw new JspTagException("Exception raised in Concept doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Concept doEndTag", e);
			throw new JspTagException("Exception raised in Concept doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

	public void setAbbreviation(String theAbbreviation) {
		abbreviation = theAbbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
