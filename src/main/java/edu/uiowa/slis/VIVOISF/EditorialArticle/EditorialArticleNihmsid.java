package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleNihmsidIterator theEditorialArticle = (EditorialArticleNihmsidIterator)findAncestorWithClass(this, EditorialArticleNihmsidIterator.class);
			pageContext.getOut().print(theEditorialArticle.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

