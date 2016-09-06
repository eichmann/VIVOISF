package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNumPagesIterator theAcademicArticle = (AcademicArticleNumPagesIterator)findAncestorWithClass(this, AcademicArticleNumPagesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for numPages tag ");
		}
		return SKIP_BODY;
	}
}

