package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleARG_0000001Iterator theEditorialArticle = (EditorialArticleARG_0000001Iterator)findAncestorWithClass(this, EditorialArticleARG_0000001Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

