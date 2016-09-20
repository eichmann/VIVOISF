package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIssuerInverseIterator theGroupIssuerInverseIterator = (GroupIssuerInverseIterator)findAncestorWithClass(this, GroupIssuerInverseIterator.class);
			pageContext.getOut().print(theGroupIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for issuer tag ");
		}
		return SKIP_BODY;
	}
}

