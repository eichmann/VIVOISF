package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherTopObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(otherTopObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherTopObjectPropertyIterator theotherTopObjectPropertyIterator = (otherTopObjectPropertyIterator)findAncestorWithClass(this, otherTopObjectPropertyIterator.class);
			pageContext.getOut().print(theotherTopObjectPropertyIterator.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing other for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

