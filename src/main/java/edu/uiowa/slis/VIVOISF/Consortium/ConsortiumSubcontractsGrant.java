package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumSubcontractsGrantIterator theConsortiumSubcontractsGrantIterator = (ConsortiumSubcontractsGrantIterator)findAncestorWithClass(this, ConsortiumSubcontractsGrantIterator.class);
			pageContext.getOut().print(theConsortiumSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

