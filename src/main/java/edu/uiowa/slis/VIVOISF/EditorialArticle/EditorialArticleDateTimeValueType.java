package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleDateTimeValueIterator theEditorialArticleDateTimeValueIterator = (EditorialArticleDateTimeValueIterator)findAncestorWithClass(this, EditorialArticleDateTimeValueIterator.class);
			pageContext.getOut().print(theEditorialArticleDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

