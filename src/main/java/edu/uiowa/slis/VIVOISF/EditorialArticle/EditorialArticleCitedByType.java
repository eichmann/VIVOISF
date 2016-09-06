package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleCitedByIterator theEditorialArticleCitedByIterator = (EditorialArticleCitedByIterator)findAncestorWithClass(this, EditorialArticleCitedByIterator.class);
			pageContext.getOut().print(theEditorialArticleCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

