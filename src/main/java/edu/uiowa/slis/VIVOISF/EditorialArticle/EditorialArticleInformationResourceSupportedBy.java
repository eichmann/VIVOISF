package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleInformationResourceSupportedByIterator theEditorialArticleInformationResourceSupportedByIterator = (EditorialArticleInformationResourceSupportedByIterator)findAncestorWithClass(this, EditorialArticleInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theEditorialArticleInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

