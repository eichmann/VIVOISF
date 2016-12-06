package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationHasAddressIterator theCommunicationHasAddressIterator = (CommunicationHasAddressIterator)findAncestorWithClass(this, CommunicationHasAddressIterator.class);
			pageContext.getOut().print(theCommunicationHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

