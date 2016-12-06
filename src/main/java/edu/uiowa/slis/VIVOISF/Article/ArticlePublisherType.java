package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticlePublisherIterator theArticlePublisherIterator = (ArticlePublisherIterator)findAncestorWithClass(this, ArticlePublisherIterator.class);
			pageContext.getOut().print(theArticlePublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for publisher tag ");
		}
		return SKIP_BODY;
	}
}

