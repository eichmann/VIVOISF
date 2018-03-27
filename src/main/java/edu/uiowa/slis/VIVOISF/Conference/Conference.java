package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Conference extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Conference currentInstance = null;
	private static final Log log = LogFactory.getLog(Conference.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConferenceIterator theConferenceIterator = (ConferenceIterator) findAncestorWithClass(this, ConferenceIterator.class);

			if (theConferenceIterator != null) {
				subjectURI = theConferenceIterator.getSubjectURI();
				label = theConferenceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator theThingSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator.class);

			if (subjectURI == null && theThingSubjectAreaOfIterator != null) {
				subjectURI = theThingSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator theConceptSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator.class);

			if (subjectURI == null && theConceptSubjectAreaOfIterator != null) {
				subjectURI = theConceptSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator theBFO_0000001RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0002353Iterator != null) {
				subjectURI = theBFO_0000001RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator theBFO_0000002RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0002353Iterator != null) {
				subjectURI = theBFO_0000002RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator theBFO_0000031RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000031RO_0002353Iterator != null) {
				subjectURI = theBFO_0000031RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator theIAO_0000030RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator.class);

			if (subjectURI == null && theIAO_0000030RO_0002353Iterator != null) {
				subjectURI = theIAO_0000030RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator theThingRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator.class);

			if (subjectURI == null && theThingRO_0002353Iterator != null) {
				subjectURI = theThingRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator theDocumentRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator.class);

			if (subjectURI == null && theDocumentRO_0002353Iterator != null) {
				subjectURI = theDocumentRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator theSlideshowRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator.class);

			if (subjectURI == null && theSlideshowRO_0002353Iterator != null) {
				subjectURI = theSlideshowRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator theConferencePosterRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator.class);

			if (subjectURI == null && theConferencePosterRO_0002353Iterator != null) {
				subjectURI = theConferencePosterRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator theDatasetRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator.class);

			if (subjectURI == null && theDatasetRO_0002353Iterator != null) {
				subjectURI = theDatasetRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator theCollectionRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator.class);

			if (subjectURI == null && theCollectionRO_0002353Iterator != null) {
				subjectURI = theCollectionRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator theAudioVisualDocumentRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator.class);

			if (subjectURI == null && theAudioVisualDocumentRO_0002353Iterator != null) {
				subjectURI = theAudioVisualDocumentRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator theArticleRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator.class);

			if (subjectURI == null && theArticleRO_0002353Iterator != null) {
				subjectURI = theArticleRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator theConferencePaperRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator.class);

			if (subjectURI == null && theConferencePaperRO_0002353Iterator != null) {
				subjectURI = theConferencePaperRO_0002353Iterator.getRO_0002353();
			}

			if (theConferenceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Conference doStartTag", e);
			throw new JspTagException("Exception raised in Conference doStartTag");
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
			log.error("Exception raised in Conference doEndTag", e);
			throw new JspTagException("Exception raised in Conference doEndTag");
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
