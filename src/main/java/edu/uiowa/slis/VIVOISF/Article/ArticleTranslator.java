package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleTranslatorIterator theArticleTranslatorIterator = (ArticleTranslatorIterator)findAncestorWithClass(this, ArticleTranslatorIterator.class);
			pageContext.getOut().print(theArticleTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for translator tag ");
		}
		return SKIP_BODY;
	}
}

