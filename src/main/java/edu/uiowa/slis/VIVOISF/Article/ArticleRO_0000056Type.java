package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleRO_0000056Iterator theArticleRO_0000056Iterator = (ArticleRO_0000056Iterator)findAncestorWithClass(this, ArticleRO_0000056Iterator.class);
			pageContext.getOut().print(theArticleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

