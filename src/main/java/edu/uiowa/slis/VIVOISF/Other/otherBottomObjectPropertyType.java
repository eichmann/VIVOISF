package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherBottomObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherBottomObjectPropertyIterator theotherBottomObjectPropertyIterator = (otherBottomObjectPropertyIterator)findAncestorWithClass(this, otherBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theotherBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

