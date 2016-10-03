package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleAsinIterator theAcademicArticle = (AcademicArticleAsinIterator)findAncestorWithClass(this, AcademicArticleAsinIterator.class);
			pageContext.getOut().print(theAcademicArticle.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for asin tag ");
		}
		return SKIP_BODY;
	}
}

