package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePageStartIterator theAcademicArticle = (AcademicArticlePageStartIterator)findAncestorWithClass(this, AcademicArticlePageStartIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

