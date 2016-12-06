package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeGAULIterator theArticle = (ArticleCodeGAULIterator)findAncestorWithClass(this, ArticleCodeGAULIterator.class);
			pageContext.getOut().print(theArticle.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

