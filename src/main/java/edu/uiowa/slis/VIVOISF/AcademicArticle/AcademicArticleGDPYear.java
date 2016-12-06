package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGDPYearIterator theAcademicArticle = (AcademicArticleGDPYearIterator)findAncestorWithClass(this, AcademicArticleGDPYearIterator.class);
			pageContext.getOut().print(theAcademicArticle.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

