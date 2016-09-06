package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumSubcontractsGrantIterator theConsortiumSubcontractsGrantIterator = (ConsortiumSubcontractsGrantIterator)findAncestorWithClass(this, ConsortiumSubcontractsGrantIterator.class);
			pageContext.getOut().print(theConsortiumSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

