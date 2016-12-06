package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommunicationTelephoneIterator theCommunication = (CommunicationTelephoneIterator)findAncestorWithClass(this, CommunicationTelephoneIterator.class);
			pageContext.getOut().print(theCommunication.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for telephone tag ");
		}
		return SKIP_BODY;
	}
}

