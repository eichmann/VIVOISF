package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleEanucc13Iterator theEditorialArticle = (EditorialArticleEanucc13Iterator)findAncestorWithClass(this, EditorialArticleEanucc13Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

