package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHDIYearIterator theAcademicArticle = (AcademicArticleHDIYearIterator)findAncestorWithClass(this, AcademicArticleHDIYearIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

