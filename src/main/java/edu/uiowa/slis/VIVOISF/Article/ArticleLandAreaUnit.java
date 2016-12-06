package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleLandAreaUnitIterator theArticle = (ArticleLandAreaUnitIterator)findAncestorWithClass(this, ArticleLandAreaUnitIterator.class);
			pageContext.getOut().print(theArticle.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

