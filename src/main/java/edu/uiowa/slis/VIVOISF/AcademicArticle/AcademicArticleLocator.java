package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLocatorIterator theAcademicArticle = (AcademicArticleLocatorIterator)findAncestorWithClass(this, AcademicArticleLocatorIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for locator tag ");
		}
		return SKIP_BODY;
	}
}

