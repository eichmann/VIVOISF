package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PrimaryPosition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPosition currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPosition.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String RO_0000052 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PrimaryPositionIterator thePrimaryPositionIterator = (PrimaryPositionIterator) findAncestorWithClass(this, PrimaryPositionIterator.class);

			if (thePrimaryPositionIterator != null) {
				subjectURI = thePrimaryPositionIterator.getSubjectURI();
				label = thePrimaryPositionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator)this.getParent()).getDateTimeIntervalInverse();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator theIndividualRelatedByIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator.class);

			if (subjectURI == null && theIndividualRelatedByIterator != null) {
				subjectURI = theIndividualRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator theChapterRelatedByIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator.class);

			if (subjectURI == null && theChapterRelatedByIterator != null) {
				subjectURI = theChapterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator.class);

			if (subjectURI == null && theAcademicArticleRelatedByIterator != null) {
				subjectURI = theAcademicArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator theConferencePosterRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator.class);

			if (subjectURI == null && theConferencePosterRelatedByIterator != null) {
				subjectURI = theConferencePosterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator thePersonRelatedByIterator = (edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator.class);

			if (subjectURI == null && thePersonRelatedByIterator != null) {
				subjectURI = thePersonRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator theSlideshowRelatedByIterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator.class);

			if (subjectURI == null && theSlideshowRelatedByIterator != null) {
				subjectURI = theSlideshowRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator theDatasetRelatedByIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator.class);

			if (subjectURI == null && theDatasetRelatedByIterator != null) {
				subjectURI = theDatasetRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator theReportRelatedByIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator.class);

			if (subjectURI == null && theReportRelatedByIterator != null) {
				subjectURI = theReportRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator.class);

			if (subjectURI == null && theConferencePaperRelatedByIterator != null) {
				subjectURI = theConferencePaperRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator.class);

			if (subjectURI == null && theAudioVisualDocumentRelatedByIterator != null) {
				subjectURI = theAudioVisualDocumentRelatedByIterator.getRelatedBy();
			}

			if (thePrimaryPositionIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?RO_0000052 where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0000052> ?RO_0000052 } "
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
					RO_0000052 = sol.get("?RO_0000052") == null ? null : sol.get("?RO_0000052").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PrimaryPosition doStartTag", e);
			throw new JspTagException("Exception raised in PrimaryPosition doStartTag");
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
			log.error("Exception raised in PrimaryPosition doEndTag", e);
			throw new JspTagException("Exception raised in PrimaryPosition doEndTag");
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

	public void setRO_0000052(String RO_0000052) {
		this.RO_0000052 = RO_0000052;
	}

	public String getRO_0000052() {
		return RO_0000052;
	}

}
