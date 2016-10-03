package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleLccnIterator theArticle = (ArticleLccnIterator)findAncestorWithClass(this, ArticleLccnIterator.class);
			pageContext.getOut().print(theArticle.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for lccn tag ");
		}
		return SKIP_BODY;
	}
}

