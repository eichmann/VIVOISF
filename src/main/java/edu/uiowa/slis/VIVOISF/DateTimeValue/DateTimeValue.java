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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator)this.getParent()).getDateTimeValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator)this.getParent()).getDateTimeValue();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator)this.getParent()).getDateTimeValue();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Patent.PatentDateFiledIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Patent.PatentDateFiledIterator)this.getParent()).getDateFiled();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountDateIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountDateIterator)this.getParent()).getHasGlobalCountDate();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeIterator)this.getParent()).getDateTime();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValuePrecision.DateTimeValuePrecisionDateTimePrecisionInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValuePrecision.DateTimeValuePrecisionDateTimePrecisionInverseIterator)this.getParent()).getDateTimePrecisionInverse();
			}

			edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator theDateTimeIntervalEndIterator = (edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalEndIterator.class);

			if (subjectURI == null && theDateTimeIntervalEndIterator != null) {
				subjectURI = theDateTimeIntervalEndIterator.getEnd();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator theAcademicArticleDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleDateTimeValueIterator.class);

			if (subjectURI == null && theAcademicArticleDateTimeValueIterator != null) {
				subjectURI = theAcademicArticleDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator theConferencePaperDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperDateTimeValueIterator.class);

			if (subjectURI == null && theConferencePaperDateTimeValueIterator != null) {
				subjectURI = theConferencePaperDateTimeValueIterator.getDateTimeValue();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator theChapterDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterDateTimeValueIterator.class);

			if (subjectURI == null && theChapterDateTimeValueIterator != null) {
				subjectURI = theChapterDateTimeValueIterator.getDateTimeValue();
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

			edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator theArticleDateTimeValueIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleDateTimeValueIterator.class);

			if (subjectURI == null && theArticleDateTimeValueIterator != null) {
				subjectURI = theArticleDateTimeValueIterator.getDateTimeValue();
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

			edu.uiowa.slis.VIVOISF.Patent.PatentDateFiledIterator thePatentDateFiledIterator = (edu.uiowa.slis.VIVOISF.Patent.PatentDateFiledIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Patent.PatentDateFiledIterator.class);

			if (subjectURI == null && thePatentDateFiledIterator != null) {
				subjectURI = thePatentDateFiledIterator.getDateFiled();
			}

			edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountDateIterator theGlobalCitationCountHasGlobalCountDateIterator = (edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountDateIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountDateIterator.class);

			if (subjectURI == null && theGlobalCitationCountHasGlobalCountDateIterator != null) {
				subjectURI = theGlobalCitationCountHasGlobalCountDateIterator.getHasGlobalCountDate();
			}

			edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeIterator theDateTimeValueDateTimeIterator = (edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeIterator.class);

			if (subjectURI == null && theDateTimeValueDateTimeIterator != null) {
				subjectURI = theDateTimeValueDateTimeIterator.getDateTime();
			}

			if (theDateTimeValueIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
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

}
