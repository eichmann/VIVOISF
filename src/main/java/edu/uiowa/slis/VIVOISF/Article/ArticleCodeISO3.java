package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeISO3Iterator theArticle = (ArticleCodeISO3Iterator)findAncestorWithClass(this, ArticleCodeISO3Iterator.class);
			pageContext.getOut().print(theArticle.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

