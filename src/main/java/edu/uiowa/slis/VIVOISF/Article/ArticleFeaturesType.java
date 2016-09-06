package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleFeaturesIterator theArticleFeaturesIterator = (ArticleFeaturesIterator)findAncestorWithClass(this, ArticleFeaturesIterator.class);
			pageContext.getOut().print(theArticleFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for features tag ");
		}
		return SKIP_BODY;
	}
}

