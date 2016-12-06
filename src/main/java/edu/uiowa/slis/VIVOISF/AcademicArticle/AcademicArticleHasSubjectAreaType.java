package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasSubjectAreaIterator theAcademicArticleHasSubjectAreaIterator = (AcademicArticleHasSubjectAreaIterator)findAncestorWithClass(this, AcademicArticleHasSubjectAreaIterator.class);
			pageContext.getOut().print(theAcademicArticleHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

