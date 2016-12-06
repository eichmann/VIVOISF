package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasResearchAreaIterator theAcademicArticleHasResearchAreaIterator = (AcademicArticleHasResearchAreaIterator)findAncestorWithClass(this, AcademicArticleHasResearchAreaIterator.class);
			pageContext.getOut().print(theAcademicArticleHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

