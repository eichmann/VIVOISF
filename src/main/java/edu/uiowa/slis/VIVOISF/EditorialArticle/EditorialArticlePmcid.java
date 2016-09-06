package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticlePmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticlePmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticlePmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticlePmcidIterator theEditorialArticle = (EditorialArticlePmcidIterator)findAncestorWithClass(this, EditorialArticlePmcidIterator.class);
			pageContext.getOut().print(theEditorialArticle.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

