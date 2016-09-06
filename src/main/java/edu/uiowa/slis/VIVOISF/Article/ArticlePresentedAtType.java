package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticlePresentedAtIterator theArticlePresentedAtIterator = (ArticlePresentedAtIterator)findAncestorWithClass(this, ArticlePresentedAtIterator.class);
			pageContext.getOut().print(theArticlePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

