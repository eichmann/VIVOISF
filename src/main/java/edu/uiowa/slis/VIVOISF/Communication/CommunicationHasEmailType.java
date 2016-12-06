package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationHasEmailIterator theCommunicationHasEmailIterator = (CommunicationHasEmailIterator)findAncestorWithClass(this, CommunicationHasEmailIterator.class);
			pageContext.getOut().print(theCommunicationHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

