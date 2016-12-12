package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Journal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Journal currentInstance = null;
	private static final Log log = LogFactory.getLog(Journal.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			JournalIterator theJournalIterator = (JournalIterator) findAncestorWithClass(this, JournalIterator.class);

			if (theJournalIterator != null) {
				subjectURI = theJournalIterator.getSubjectURI();
				label = theJournalIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator theBFO_0000001HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000001HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000001HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator theBFO_0000002HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000002HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000002HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator theBFO_0000031HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000031HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000031HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator theIAO_0000030HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator.class);

			if (subjectURI == null && theIAO_0000030HasPublicationVenueIterator != null) {
				subjectURI = theIAO_0000030HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator theDocumentHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator.class);

			if (subjectURI == null && theDocumentHasPublicationVenueIterator != null) {
				subjectURI = theDocumentHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator theThingHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator.class);

			if (subjectURI == null && theThingHasPublicationVenueIterator != null) {
				subjectURI = theThingHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator theArticleHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator.class);

			if (subjectURI == null && theArticleHasPublicationVenueIterator != null) {
				subjectURI = theArticleHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator theAcademicArticleHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator.class);

			if (subjectURI == null && theAcademicArticleHasPublicationVenueIterator != null) {
				subjectURI = theAcademicArticleHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator theBookHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator.class);

			if (subjectURI == null && theBookHasPublicationVenueIterator != null) {
				subjectURI = theBookHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator theConferencePaperHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator.class);

			if (subjectURI == null && theConferencePaperHasPublicationVenueIterator != null) {
				subjectURI = theConferencePaperHasPublicationVenueIterator.getHasPublicationVenue();
			}

			if (theJournalIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Journal doStartTag", e);
			throw new JspTagException("Exception raised in Journal doStartTag");
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
			log.error("Exception raised in Journal doEndTag", e);
			throw new JspTagException("Exception raised in Journal doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
