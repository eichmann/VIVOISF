package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationIsSuccessorOfIterator theorganizationIsSuccessorOfIterator = (organizationIsSuccessorOfIterator)findAncestorWithClass(this, organizationIsSuccessorOfIterator.class);
			pageContext.getOut().print(theorganizationIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

