package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleContent currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleContentIterator theAcademicArticle = (AcademicArticleContentIterator)findAncestorWithClass(this, AcademicArticleContentIterator.class);
			pageContext.getOut().print(theAcademicArticle.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for content tag ");
		}
		return SKIP_BODY;
	}
}

