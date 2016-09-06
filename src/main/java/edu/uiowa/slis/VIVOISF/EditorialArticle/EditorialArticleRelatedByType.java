package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleRelatedByIterator theEditorialArticleRelatedByIterator = (EditorialArticleRelatedByIterator)findAncestorWithClass(this, EditorialArticleRelatedByIterator.class);
			pageContext.getOut().print(theEditorialArticleRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

