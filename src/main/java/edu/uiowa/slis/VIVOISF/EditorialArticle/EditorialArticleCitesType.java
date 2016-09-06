package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleCitesIterator theEditorialArticleCitesIterator = (EditorialArticleCitesIterator)findAncestorWithClass(this, EditorialArticleCitesIterator.class);
			pageContext.getOut().print(theEditorialArticleCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for cites tag ");
		}
		return SKIP_BODY;
	}
}

