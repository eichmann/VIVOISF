package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleShortTitleIterator theAcademicArticle = (AcademicArticleShortTitleIterator)findAncestorWithClass(this, AcademicArticleShortTitleIterator.class);
			pageContext.getOut().print(theAcademicArticle.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

