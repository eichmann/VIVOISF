package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Event extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Event currentInstance = null;
	private static final Log log = LogFactory.getLog(Event.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;
	String placeOfPublication = null;
	String hideFromDisplay = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EventIterator theEventIterator = (EventIterator) findAncestorWithClass(this, EventIterator.class);

			if (theEventIterator != null) {
				subjectURI = theEventIterator.getSubjectURI();
				label = theEventIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator)this.getParent()).getDateTimeIntervalInverse();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator theThingSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator.class);

			if (subjectURI == null && theThingSubjectAreaOfIterator != null) {
				subjectURI = theThingSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator theConceptSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator.class);

			if (subjectURI == null && theConceptSubjectAreaOfIterator != null) {
				subjectURI = theConceptSubjectAreaOfIterator.getSubjectAreaOf();
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

			if (theEventIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?abbreviation ?placeOfPublication ?hideFromDisplay where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#placeOfPublication> ?placeOfPublication } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hideFromDisplay> ?hideFromDisplay } "
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
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
					placeOfPublication = sol.get("?placeOfPublication") == null ? null : sol.get("?placeOfPublication").toString();
					hideFromDisplay = sol.get("?hideFromDisplay") == null ? null : sol.get("?hideFromDisplay").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Event doStartTag", e);
			throw new JspTagException("Exception raised in Event doStartTag");
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
			log.error("Exception raised in Event doEndTag", e);
			throw new JspTagException("Exception raised in Event doEndTag");
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

	public void setPlaceOfPublication(String placeOfPublication) {
		this.placeOfPublication = placeOfPublication;
	}

	public String getPlaceOfPublication() {
		return placeOfPublication;
	}

	public void setHideFromDisplay(String hideFromDisplay) {
		this.hideFromDisplay = hideFromDisplay;
	}

	public String getHideFromDisplay() {
		return hideFromDisplay;
	}

}
