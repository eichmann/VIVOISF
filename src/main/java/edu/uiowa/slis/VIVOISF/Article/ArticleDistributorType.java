package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleDistributorIterator theArticleDistributorIterator = (ArticleDistributorIterator)findAncestorWithClass(this, ArticleDistributorIterator.class);
			pageContext.getOut().print(theArticleDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for distributor tag ");
		}
		return SKIP_BODY;
	}
}

