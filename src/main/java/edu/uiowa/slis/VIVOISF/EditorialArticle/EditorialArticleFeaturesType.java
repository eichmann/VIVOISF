package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleFeaturesIterator theEditorialArticleFeaturesIterator = (EditorialArticleFeaturesIterator)findAncestorWithClass(this, EditorialArticleFeaturesIterator.class);
			pageContext.getOut().print(theEditorialArticleFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for features tag ");
		}
		return SKIP_BODY;
	}
}

