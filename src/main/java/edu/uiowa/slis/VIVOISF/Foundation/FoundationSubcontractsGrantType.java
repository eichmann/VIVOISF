package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationSubcontractsGrantIterator theFoundationSubcontractsGrantIterator = (FoundationSubcontractsGrantIterator)findAncestorWithClass(this, FoundationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theFoundationSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

