package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationSubcontractsGrantIterator theFoundationSubcontractsGrantIterator = (FoundationSubcontractsGrantIterator)findAncestorWithClass(this, FoundationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theFoundationSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

