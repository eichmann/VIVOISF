package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterSubcontractsGrantIterator theCenterSubcontractsGrantIterator = (CenterSubcontractsGrantIterator)findAncestorWithClass(this, CenterSubcontractsGrantIterator.class);
			pageContext.getOut().print(theCenterSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

