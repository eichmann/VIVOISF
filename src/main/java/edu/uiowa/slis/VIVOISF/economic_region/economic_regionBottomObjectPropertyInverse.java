package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionBottomObjectPropertyInverseIterator theeconomic_regionBottomObjectPropertyInverseIterator = (economic_regionBottomObjectPropertyInverseIterator)findAncestorWithClass(this, economic_regionBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theeconomic_regionBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}
