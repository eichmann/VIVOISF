package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherSameAsInverseIterator theotherSameAsInverseIterator = (otherSameAsInverseIterator)findAncestorWithClass(this, otherSameAsInverseIterator.class);
			pageContext.getOut().print(theotherSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

