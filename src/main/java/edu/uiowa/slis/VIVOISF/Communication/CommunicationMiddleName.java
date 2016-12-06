package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommunicationMiddleNameIterator theCommunication = (CommunicationMiddleNameIterator)findAncestorWithClass(this, CommunicationMiddleNameIterator.class);
			pageContext.getOut().print(theCommunication.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for middleName tag ");
		}
		return SKIP_BODY;
	}
}

