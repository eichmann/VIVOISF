package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedTopObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedTopObjectPropertyIterator thedisputedTopObjectPropertyIterator = (disputedTopObjectPropertyIterator)findAncestorWithClass(this, disputedTopObjectPropertyIterator.class);
			pageContext.getOut().print(thedisputedTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

