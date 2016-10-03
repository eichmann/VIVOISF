package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationBottomObjectPropertyInverseIterator theorganizationBottomObjectPropertyInverseIterator = (organizationBottomObjectPropertyInverseIterator)findAncestorWithClass(this, organizationBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theorganizationBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

