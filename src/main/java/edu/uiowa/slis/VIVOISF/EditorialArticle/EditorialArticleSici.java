package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleSici currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleSiciIterator theEditorialArticle = (EditorialArticleSiciIterator)findAncestorWithClass(this, EditorialArticleSiciIterator.class);
			pageContext.getOut().print(theEditorialArticle.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for sici tag ");
		}
		return SKIP_BODY;
	}
}

