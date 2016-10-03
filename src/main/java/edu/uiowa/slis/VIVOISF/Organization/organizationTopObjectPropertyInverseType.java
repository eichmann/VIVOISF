package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationTopObjectPropertyInverseIterator theorganizationTopObjectPropertyInverseIterator = (organizationTopObjectPropertyInverseIterator)findAncestorWithClass(this, organizationTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theorganizationTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

