package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationHasAddressIterator theCommunicationHasAddressIterator = (CommunicationHasAddressIterator)findAncestorWithClass(this, CommunicationHasAddressIterator.class);
			pageContext.getOut().print(theCommunicationHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

