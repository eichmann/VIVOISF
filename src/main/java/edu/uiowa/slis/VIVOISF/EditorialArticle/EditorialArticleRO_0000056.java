package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleRO_0000056Iterator theEditorialArticleRO_0000056Iterator = (EditorialArticleRO_0000056Iterator)findAncestorWithClass(this, EditorialArticleRO_0000056Iterator.class);
			pageContext.getOut().print(theEditorialArticleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

