package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleDistributorIterator theEditorialArticleDistributorIterator = (EditorialArticleDistributorIterator)findAncestorWithClass(this, EditorialArticleDistributorIterator.class);
			pageContext.getOut().print(theEditorialArticleDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for distributor tag ");
		}
		return SKIP_BODY;
	}
}

