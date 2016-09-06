package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasSubjectAreaIterator theAcademicArticleHasSubjectAreaIterator = (AcademicArticleHasSubjectAreaIterator)findAncestorWithClass(this, AcademicArticleHasSubjectAreaIterator.class);
			pageContext.getOut().print(theAcademicArticleHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

