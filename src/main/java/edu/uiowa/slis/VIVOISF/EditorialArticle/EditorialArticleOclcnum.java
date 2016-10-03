package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleOclcnumIterator theEditorialArticle = (EditorialArticleOclcnumIterator)findAncestorWithClass(this, EditorialArticleOclcnumIterator.class);
			pageContext.getOut().print(theEditorialArticle.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

