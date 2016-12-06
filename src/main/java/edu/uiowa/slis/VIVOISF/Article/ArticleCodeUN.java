package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeUNIterator theArticle = (ArticleCodeUNIterator)findAncestorWithClass(this, ArticleCodeUNIterator.class);
			pageContext.getOut().print(theArticle.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

