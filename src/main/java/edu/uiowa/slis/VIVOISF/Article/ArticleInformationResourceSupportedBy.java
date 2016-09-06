package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleInformationResourceSupportedByIterator theArticleInformationResourceSupportedByIterator = (ArticleInformationResourceSupportedByIterator)findAncestorWithClass(this, ArticleInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theArticleInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

