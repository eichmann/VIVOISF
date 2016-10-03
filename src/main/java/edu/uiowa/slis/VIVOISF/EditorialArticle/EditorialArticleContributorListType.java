package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleContributorListIterator theEditorialArticleContributorListIterator = (EditorialArticleContributorListIterator)findAncestorWithClass(this, EditorialArticleContributorListIterator.class);
			pageContext.getOut().print(theEditorialArticleContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

