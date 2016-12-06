package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeFAOSTATIterator theArticle = (ArticleCodeFAOSTATIterator)findAncestorWithClass(this, ArticleCodeFAOSTATIterator.class);
			pageContext.getOut().print(theArticle.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

