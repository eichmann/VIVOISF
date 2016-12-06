package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationHasURLIterator theCommunicationHasURLIterator = (CommunicationHasURLIterator)findAncestorWithClass(this, CommunicationHasURLIterator.class);
			pageContext.getOut().print(theCommunicationHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

