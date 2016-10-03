package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleUpcIterator theEditorialArticle = (EditorialArticleUpcIterator)findAncestorWithClass(this, EditorialArticleUpcIterator.class);
			pageContext.getOut().print(theEditorialArticle.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for upc tag ");
		}
		return SKIP_BODY;
	}
}

