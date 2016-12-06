package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasAddressIterator theArticleHasAddressIterator = (ArticleHasAddressIterator)findAncestorWithClass(this, ArticleHasAddressIterator.class);
			pageContext.getOut().print(theArticleHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

