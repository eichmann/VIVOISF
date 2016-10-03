package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleLccnIterator theEditorialArticle = (EditorialArticleLccnIterator)findAncestorWithClass(this, EditorialArticleLccnIterator.class);
			pageContext.getOut().print(theEditorialArticle.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for lccn tag ");
		}
		return SKIP_BODY;
	}
}

