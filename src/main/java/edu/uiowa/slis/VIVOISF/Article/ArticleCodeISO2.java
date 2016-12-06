package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeISO2Iterator theArticle = (ArticleCodeISO2Iterator)findAncestorWithClass(this, ArticleCodeISO2Iterator.class);
			pageContext.getOut().print(theArticle.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

