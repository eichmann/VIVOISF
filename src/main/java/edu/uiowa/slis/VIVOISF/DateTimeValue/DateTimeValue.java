package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValue.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeValueIterator theDateTimeValueIterator = (DateTimeValueIterator) findAncestorWithClass(this, DateTimeValueIterator.class);

			if (theDateTimeValueIterator != null) {
				subjectURI = theDateTimeValueIterator.getSubjectURI();
				label = theDateTimeValueIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator)this.getParent()).getEnd();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001DateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001DateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002DateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002DateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031DateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031DateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030DateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030DateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalStartIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalStartIterator)this.getParent()).getStart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValuePrecision.DateTimeValuePrecisionDateTimePrecisionInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValuePrecision.DateTimeValuePrecisionDateTimePrecisionInverseIterator)this.getParent()).getDateTimePrecisionInverse();
			}

			edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator theDateTimeIntervalEndIterator = (edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator.class);

			if (subjectURI == null && theDateTimeIntervalEndIterator != null) {
				subjectURI = theDateTimeIntervalEndIterator.getEnd();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001DateTimeValueIterator theBFO_0000001DateTimeValueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001DateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001DateTimeValueIterator.class);

			if (subjectURI == null && theBFO_0000001DateTimeValueIterator != null) {
				subjectURI = theBFO_0000001DateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002DateTimeValueIterator theBFO_0000002DateTimeValueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002DateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002DateTimeValueIterator.class);

			if (subjectURI == null && theBFO_0000002DateTimeValueIterator != null) {
				subjectURI = theBFO_0000002DateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031DateTimeValueIterator theBFO_0000031DateTimeValueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031DateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031DateTimeValueIterator.class);

			if (subjectURI == null && theBFO_0000031DateTimeValueIterator != null) {
				subjectURI = theBFO_0000031DateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030DateTimeValueIterator theIAO_0000030DateTimeValueIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030DateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030DateTimeValueIterator.class);

			if (subjectURI == null && theIAO_0000030DateTimeValueIterator != null) {
				subjectURI = theIAO_0000030DateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingDateTimeValueIterator theThingDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingDateTimeValueIterator.class);

			if (subjectURI == null && theThingDateTimeValueIterator != null) {
				subjectURI = theThingDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentDateTimeValueIterator theDocumentDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentDateTimeValueIterator.class);

			if (subjectURI == null && theDocumentDateTimeValueIterator != null) {
				subjectURI = theDocumentDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator theArticleDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator.class);

			if (subjectURI == null && theArticleDateTimeValueIterator != null) {
				subjectURI = theArticleDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator theAcademicArticleDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator.class);

			if (subjectURI == null && theAcademicArticleDateTimeValueIterator != null) {
				subjectURI = theAcademicArticleDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator theConferencePaperDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator.class);

			if (subjectURI == null && theConferencePaperDateTimeValueIterator != null) {
				subjectURI = theConferencePaperDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionDateTimeValueIterator theBookSectionDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionDateTimeValueIterator.class);

			if (subjectURI == null && theBookSectionDateTimeValueIterator != null) {
				subjectURI = theBookSectionDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator theChapterDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator.class);

			if (subjectURI == null && theChapterDateTimeValueIterator != null) {
				subjectURI = theChapterDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartDateTimeValueIterator theDocumentPartDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartDateTimeValueIterator.class);

			if (subjectURI == null && theDocumentPartDateTimeValueIterator != null) {
				subjectURI = theDocumentPartDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowDateTimeValueIterator theSlideshowDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowDateTimeValueIterator.class);

			if (subjectURI == null && theSlideshowDateTimeValueIterator != null) {
				subjectURI = theSlideshowDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterDateTimeValueIterator theConferencePosterDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterDateTimeValueIterator.class);

			if (subjectURI == null && theConferencePosterDateTimeValueIterator != null) {
				subjectURI = theConferencePosterDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetDateTimeValueIterator theDatasetDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetDateTimeValueIterator.class);

			if (subjectURI == null && theDatasetDateTimeValueIterator != null) {
				subjectURI = theDatasetDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Book.BookDateTimeValueIterator theBookDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Book.BookDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookDateTimeValueIterator.class);

			if (subjectURI == null && theBookDateTimeValueIterator != null) {
				subjectURI = theBookDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionDateTimeValueIterator theCollectionDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionDateTimeValueIterator.class);

			if (subjectURI == null && theCollectionDateTimeValueIterator != null) {
				subjectURI = theCollectionDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportDateTimeValueIterator theReportDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Report.ReportDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportDateTimeValueIterator.class);

			if (subjectURI == null && theReportDateTimeValueIterator != null) {
				subjectURI = theReportDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentDateTimeValueIterator theAudioVisualDocumentDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentDateTimeValueIterator.class);

			if (subjectURI == null && theAudioVisualDocumentDateTimeValueIterator != null) {
				subjectURI = theAudioVisualDocumentDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalStartIterator theDateTimeIntervalStartIterator = (edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalStartIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalStartIterator.class);

			if (subjectURI == null && theDateTimeIntervalStartIterator != null) {
				subjectURI = theDateTimeIntervalStartIterator.getStart();
			}

			if (theDateTimeValueIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
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
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValue doStartTag", e);
			throw new JspTagException("Exception raised in DateTimeValue doStartTag");
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
			log.error("Exception raised in DateTimeValue doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeValue doEndTag");
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

}
