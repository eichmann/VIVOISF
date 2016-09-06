package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleStatusIterator theEditorialArticleStatusIterator = (EditorialArticleStatusIterator)findAncestorWithClass(this, EditorialArticleStatusIterator.class);
			pageContext.getOut().print(theEditorialArticleStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for status tag ");
		}
		return SKIP_BODY;
	}
}

