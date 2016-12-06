package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHDINotesIterator theAcademicArticle = (AcademicArticleHDINotesIterator)findAncestorWithClass(this, AcademicArticleHDINotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

