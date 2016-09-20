package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleERO_0000045Iterator theEditorialArticle = (EditorialArticleERO_0000045Iterator)findAncestorWithClass(this, EditorialArticleERO_0000045Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

