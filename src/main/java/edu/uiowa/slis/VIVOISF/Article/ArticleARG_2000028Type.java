package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleARG_2000028Iterator theArticleARG_2000028Iterator = (ArticleARG_2000028Iterator)findAncestorWithClass(this, ArticleARG_2000028Iterator.class);
			pageContext.getOut().print(theArticleARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

