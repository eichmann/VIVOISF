package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleRelatesIterator theArticleRelatesIterator = (ArticleRelatesIterator)findAncestorWithClass(this, ArticleRelatesIterator.class);
			pageContext.getOut().print(theArticleRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for relates tag ");
		}
		return SKIP_BODY;
	}
}

