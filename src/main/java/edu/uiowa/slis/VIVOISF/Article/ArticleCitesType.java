package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleCitesIterator theArticleCitesIterator = (ArticleCitesIterator)findAncestorWithClass(this, ArticleCitesIterator.class);
			pageContext.getOut().print(theArticleCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for cites tag ");
		}
		return SKIP_BODY;
	}
}

