package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherBottomObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherBottomObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherBottomObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherBottomObjectPropertyInverseIterator theotherBottomObjectPropertyInverseIterator = (otherBottomObjectPropertyInverseIterator)findAncestorWithClass(this, otherBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theotherBottomObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}
