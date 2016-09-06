package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleDocumentationForIterator theArticleDocumentationForIterator = (ArticleDocumentationForIterator)findAncestorWithClass(this, ArticleDocumentationForIterator.class);
			pageContext.getOut().print(theArticleDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

