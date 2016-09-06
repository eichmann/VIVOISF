package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationIsPredecessorOfIterator theorganizationIsPredecessorOfIterator = (organizationIsPredecessorOfIterator)findAncestorWithClass(this, organizationIsPredecessorOfIterator.class);
			pageContext.getOut().print(theorganizationIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

