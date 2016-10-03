package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleTranscriptOfIterator theAcademicArticleTranscriptOfIterator = (AcademicArticleTranscriptOfIterator)findAncestorWithClass(this, AcademicArticleTranscriptOfIterator.class);
			pageContext.getOut().print(theAcademicArticleTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}
