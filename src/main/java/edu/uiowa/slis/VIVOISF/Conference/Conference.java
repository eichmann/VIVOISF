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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Proceedings.ProceedingsProceedingsOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Proceedings.ProceedingsProceedingsOfIterator)this.getParent()).getProceedingsOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator theConceptSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator.class);

			if (subjectURI == null && theConceptSubjectAreaOfIterator != null) {
				subjectURI = theConceptSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Proceedings.ProceedingsProceedingsOfIterator theProceedingsProceedingsOfIterator = (edu.uiowa.slis.VIVOISF.Proceedings.ProceedingsProceedingsOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Proceedings.ProceedingsProceedingsOfIterator.class);

			if (subjectURI == null && theProceedingsProceedingsOfIterator != null) {
				subjectURI = theProceedingsProceedingsOfIterator.getProceedingsOf();
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

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator theConferencePaperRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator.class);

			if (subjectURI == null && theConferencePaperRO_0002353Iterator != null) {
				subjectURI = theConferencePaperRO_0002353Iterator.getRO_0002353();
			}

			if (theConferenceIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?abbreviation where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
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
