package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleCitedByIterator theArticleCitedByIterator = (ArticleCitedByIterator)findAncestorWithClass(this, ArticleCitedByIterator.class);
			pageContext.getOut().print(theArticleCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

