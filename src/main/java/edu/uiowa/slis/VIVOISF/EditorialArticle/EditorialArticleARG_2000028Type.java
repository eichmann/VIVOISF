package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleARG_2000028Iterator theEditorialArticleARG_2000028Iterator = (EditorialArticleARG_2000028Iterator)findAncestorWithClass(this, EditorialArticleARG_2000028Iterator.class);
			pageContext.getOut().print(theEditorialArticleARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

