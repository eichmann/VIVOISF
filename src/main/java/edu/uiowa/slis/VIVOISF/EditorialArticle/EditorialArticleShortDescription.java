package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleShortDescriptionIterator theEditorialArticle = (EditorialArticleShortDescriptionIterator)findAncestorWithClass(this, EditorialArticleShortDescriptionIterator.class);
			pageContext.getOut().print(theEditorialArticle.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

