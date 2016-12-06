package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeUNDPIterator theArticle = (ArticleCodeUNDPIterator)findAncestorWithClass(this, ArticleCodeUNDPIterator.class);
			pageContext.getOut().print(theArticle.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

