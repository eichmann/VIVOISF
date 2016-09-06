package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePresentedAtIterator theEditorialArticlePresentedAtIterator = (EditorialArticlePresentedAtIterator)findAncestorWithClass(this, EditorialArticlePresentedAtIterator.class);
			pageContext.getOut().print(theEditorialArticlePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

