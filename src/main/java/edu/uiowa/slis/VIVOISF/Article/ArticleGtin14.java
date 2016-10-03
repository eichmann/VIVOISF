package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleGtin14Iterator theArticle = (ArticleGtin14Iterator)findAncestorWithClass(this, ArticleGtin14Iterator.class);
			pageContext.getOut().print(theArticle.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

