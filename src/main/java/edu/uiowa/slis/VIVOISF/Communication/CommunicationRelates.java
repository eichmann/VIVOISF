package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationRelatesIterator theCommunicationRelatesIterator = (CommunicationRelatesIterator)findAncestorWithClass(this, CommunicationRelatesIterator.class);
			pageContext.getOut().print(theCommunicationRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for relates tag ");
		}
		return SKIP_BODY;
	}
}

