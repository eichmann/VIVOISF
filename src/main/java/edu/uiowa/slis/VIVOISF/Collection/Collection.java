package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Collection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Collection currentInstance = null;
	private static final Log log = LogFactory.getLog(Collection.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CollectionIterator theCollectionIterator = (CollectionIterator) findAncestorWithClass(this, CollectionIterator.class);

			if (theCollectionIterator != null) {
				subjectURI = theCollectionIterator.getSubjectURI();
				label = theCollectionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator theBFO_0000001RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0002234Iterator != null) {
				subjectURI = theBFO_0000001RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator theBFO_0000003RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000003RO_0002234Iterator != null) {
				subjectURI = theBFO_0000003RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator theBFO_0000015RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000015RO_0002234Iterator != null) {
				subjectURI = theBFO_0000015RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator theEventRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator.class);

			if (subjectURI == null && theEventRO_0002234Iterator != null) {
				subjectURI = theEventRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator theConferenceRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator.class);

			if (subjectURI == null && theConferenceRO_0002234Iterator != null) {
				subjectURI = theConferenceRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator theThingRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator.class);

			if (subjectURI == null && theThingRO_0002234Iterator != null) {
				subjectURI = theThingRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
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

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			if (theCollectionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Collection doStartTag", e);
			throw new JspTagException("Exception raised in Collection doStartTag");
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
			log.error("Exception raised in Collection doEndTag", e);
			throw new JspTagException("Exception raised in Collection doEndTag");
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
