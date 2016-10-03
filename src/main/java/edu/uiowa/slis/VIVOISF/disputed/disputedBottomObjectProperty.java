package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedBottomObjectPropertyIterator thedisputedBottomObjectPropertyIterator = (disputedBottomObjectPropertyIterator)findAncestorWithClass(this, disputedBottomObjectPropertyIterator.class);
			pageContext.getOut().print(thedisputedBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}
