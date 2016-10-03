package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleSection currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleSectionIterator theAcademicArticle = (AcademicArticleSectionIterator)findAncestorWithClass(this, AcademicArticleSectionIterator.class);
			pageContext.getOut().print(theAcademicArticle.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for section tag ");
		}
		return SKIP_BODY;
	}
}

