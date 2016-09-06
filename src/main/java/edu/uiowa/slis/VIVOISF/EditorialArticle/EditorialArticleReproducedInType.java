package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleReproducedInIterator theEditorialArticleReproducedInIterator = (EditorialArticleReproducedInIterator)findAncestorWithClass(this, EditorialArticleReproducedInIterator.class);
			pageContext.getOut().print(theEditorialArticleReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

