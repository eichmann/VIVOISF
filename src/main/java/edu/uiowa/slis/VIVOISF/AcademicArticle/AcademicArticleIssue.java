package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIssueIterator theAcademicArticle = (AcademicArticleIssueIterator)findAncestorWithClass(this, AcademicArticleIssueIterator.class);
			pageContext.getOut().print(theAcademicArticle.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for issue tag ");
		}
		return SKIP_BODY;
	}
}

