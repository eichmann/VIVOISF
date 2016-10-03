package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodenIterator theAcademicArticle = (AcademicArticleCodenIterator)findAncestorWithClass(this, AcademicArticleCodenIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for coden tag ");
		}
		return SKIP_BODY;
	}
}

