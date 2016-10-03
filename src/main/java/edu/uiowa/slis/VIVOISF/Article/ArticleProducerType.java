package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleProducerIterator theArticleProducerIterator = (ArticleProducerIterator)findAncestorWithClass(this, ArticleProducerIterator.class);
			pageContext.getOut().print(theArticleProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for producer tag ");
		}
		return SKIP_BODY;
	}
}

