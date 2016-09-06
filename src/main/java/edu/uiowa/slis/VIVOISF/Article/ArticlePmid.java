package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePmidIterator theArticle = (ArticlePmidIterator)findAncestorWithClass(this, ArticlePmidIterator.class);
			pageContext.getOut().print(theArticle.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for pmid tag ");
		}
		return SKIP_BODY;
	}
}

