package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePmcidIterator theArticle = (ArticlePmcidIterator)findAncestorWithClass(this, ArticlePmcidIterator.class);
			pageContext.getOut().print(theArticle.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

