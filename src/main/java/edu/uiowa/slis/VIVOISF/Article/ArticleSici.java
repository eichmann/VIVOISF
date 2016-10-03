package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleSiciIterator theArticle = (ArticleSiciIterator)findAncestorWithClass(this, ArticleSiciIterator.class);
			pageContext.getOut().print(theArticle.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for sici tag ");
		}
		return SKIP_BODY;
	}
}

