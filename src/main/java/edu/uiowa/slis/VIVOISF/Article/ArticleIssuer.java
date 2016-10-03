package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleIssuerIterator theArticleIssuerIterator = (ArticleIssuerIterator)findAncestorWithClass(this, ArticleIssuerIterator.class);
			pageContext.getOut().print(theArticleIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for issuer tag ");
		}
		return SKIP_BODY;
	}
}

