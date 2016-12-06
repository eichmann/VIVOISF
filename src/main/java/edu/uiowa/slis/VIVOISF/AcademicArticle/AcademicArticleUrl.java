package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleUrlIterator theAcademicArticle = (AcademicArticleUrlIterator)findAncestorWithClass(this, AcademicArticleUrlIterator.class);
			pageContext.getOut().print(theAcademicArticle.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for url tag ");
		}
		return SKIP_BODY;
	}
}

