package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePmidIterator theEditorialArticle = (EditorialArticlePmidIterator)findAncestorWithClass(this, EditorialArticlePmidIterator.class);
			pageContext.getOut().print(theEditorialArticle.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for pmid tag ");
		}
		return SKIP_BODY;
	}
}

