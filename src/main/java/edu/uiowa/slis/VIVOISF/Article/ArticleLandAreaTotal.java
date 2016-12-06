package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleLandAreaTotalIterator theArticle = (ArticleLandAreaTotalIterator)findAncestorWithClass(this, ArticleLandAreaTotalIterator.class);
			pageContext.getOut().print(theArticle.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

