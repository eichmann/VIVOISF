package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleIAO_0000136Iterator theArticleIAO_0000136Iterator = (ArticleIAO_0000136Iterator)findAncestorWithClass(this, ArticleIAO_0000136Iterator.class);
			pageContext.getOut().print(theArticleIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

