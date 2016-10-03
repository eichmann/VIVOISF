package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePages currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePagesIterator theAcademicArticle = (AcademicArticlePagesIterator)findAncestorWithClass(this, AcademicArticlePagesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for pages tag ");
		}
		return SKIP_BODY;
	}
}

