package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeAGROVOCIterator theArticle = (ArticleCodeAGROVOCIterator)findAncestorWithClass(this, ArticleCodeAGROVOCIterator.class);
			pageContext.getOut().print(theArticle.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

