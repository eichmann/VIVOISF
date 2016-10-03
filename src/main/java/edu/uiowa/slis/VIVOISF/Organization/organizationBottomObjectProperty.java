package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationBottomObjectPropertyIterator theorganizationBottomObjectPropertyIterator = (organizationBottomObjectPropertyIterator)findAncestorWithClass(this, organizationBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theorganizationBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

