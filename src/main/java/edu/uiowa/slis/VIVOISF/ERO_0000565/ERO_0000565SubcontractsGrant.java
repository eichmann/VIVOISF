package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565SubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565SubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565SubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565SubcontractsGrantIterator theERO_0000565SubcontractsGrantIterator = (ERO_0000565SubcontractsGrantIterator)findAncestorWithClass(this, ERO_0000565SubcontractsGrantIterator.class);
			pageContext.getOut().print(theERO_0000565SubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

