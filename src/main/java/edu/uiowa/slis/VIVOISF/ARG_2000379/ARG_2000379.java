package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ARG_2000379 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ARG_2000379Iterator theARG_2000379Iterator = (ARG_2000379Iterator) findAncestorWithClass(this, ARG_2000379Iterator.class);

			if (theARG_2000379Iterator != null) {
				subjectURI = theARG_2000379Iterator.getSubjectURI();
				label = theARG_2000379Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator theAcademicArticleARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator.class);

			if (subjectURI == null && theAcademicArticleARG_2000028Iterator != null) {
				subjectURI = theAcademicArticleARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator thePersonARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator.class);

			if (subjectURI == null && thePersonARG_2000028Iterator != null) {
				subjectURI = thePersonARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator theArticleARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator.class);

			if (subjectURI == null && theArticleARG_2000028Iterator != null) {
				subjectURI = theArticleARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator theDatasetARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator.class);

			if (subjectURI == null && theDatasetARG_2000028Iterator != null) {
				subjectURI = theDatasetARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator theConferencePaperARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator.class);

			if (subjectURI == null && theConferencePaperARG_2000028Iterator != null) {
				subjectURI = theConferencePaperARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator theChapterARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator.class);

			if (subjectURI == null && theChapterARG_2000028Iterator != null) {
				subjectURI = theChapterARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator theSlideshowARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator.class);

			if (subjectURI == null && theSlideshowARG_2000028Iterator != null) {
				subjectURI = theSlideshowARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator theConferencePosterARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator.class);

			if (subjectURI == null && theConferencePosterARG_2000028Iterator != null) {
				subjectURI = theConferencePosterARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator theBookARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator.class);

			if (subjectURI == null && theBookARG_2000028Iterator != null) {
				subjectURI = theBookARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator theCollectionARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator.class);

			if (subjectURI == null && theCollectionARG_2000028Iterator != null) {
				subjectURI = theCollectionARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator theConferenceARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator.class);

			if (subjectURI == null && theConferenceARG_2000028Iterator != null) {
				subjectURI = theConferenceARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator theReportARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator.class);

			if (subjectURI == null && theReportARG_2000028Iterator != null) {
				subjectURI = theReportARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator theAudioVisualDocumentARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator.class);

			if (subjectURI == null && theAudioVisualDocumentARG_2000028Iterator != null) {
				subjectURI = theAudioVisualDocumentARG_2000028Iterator.getARG_2000028();
			}

			if (theARG_2000379Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000379 doStartTag", e);
			throw new JspTagException("Exception raised in ARG_2000379 doStartTag");
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
			log.error("Exception raised in ARG_2000379 doEndTag", e);
			throw new JspTagException("Exception raised in ARG_2000379 doEndTag");
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
