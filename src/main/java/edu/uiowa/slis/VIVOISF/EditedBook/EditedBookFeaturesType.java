package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookFeaturesIterator theEditedBookFeaturesIterator = (EditedBookFeaturesIterator)findAncestorWithClass(this, EditedBookFeaturesIterator.class);
			pageContext.getOut().print(theEditedBookFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for features tag ");
		}
		return SKIP_BODY;
	}
}

