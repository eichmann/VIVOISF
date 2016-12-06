package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleRO_0002234Iterator theArticleRO_0002234Iterator = (ArticleRO_0002234Iterator)findAncestorWithClass(this, ArticleRO_0002234Iterator.class);
			pageContext.getOut().print(theArticleRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

