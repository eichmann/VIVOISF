package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleGtin14Iterator theEditorialArticle = (EditorialArticleGtin14Iterator)findAncestorWithClass(this, EditorialArticleGtin14Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

