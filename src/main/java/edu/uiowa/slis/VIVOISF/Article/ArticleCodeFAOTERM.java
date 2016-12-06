package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeFAOTERMIterator theArticle = (ArticleCodeFAOTERMIterator)findAncestorWithClass(this, ArticleCodeFAOTERMIterator.class);
			pageContext.getOut().print(theArticle.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

