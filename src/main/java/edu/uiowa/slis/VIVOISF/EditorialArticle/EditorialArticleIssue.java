package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleIssueIterator theEditorialArticle = (EditorialArticleIssueIterator)findAncestorWithClass(this, EditorialArticleIssueIterator.class);
			pageContext.getOut().print(theEditorialArticle.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for issue tag ");
		}
		return SKIP_BODY;
	}
}

