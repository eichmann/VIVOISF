package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleIssueIterator theArticle = (ArticleIssueIterator)findAncestorWithClass(this, ArticleIssueIterator.class);
			pageContext.getOut().print(theArticle.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for issue tag ");
		}
		return SKIP_BODY;
	}
}

