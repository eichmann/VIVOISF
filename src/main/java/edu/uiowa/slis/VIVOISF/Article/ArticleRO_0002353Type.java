package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleRO_0002353Iterator theArticleRO_0002353Iterator = (ArticleRO_0002353Iterator)findAncestorWithClass(this, ArticleRO_0002353Iterator.class);
			pageContext.getOut().print(theArticleRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

