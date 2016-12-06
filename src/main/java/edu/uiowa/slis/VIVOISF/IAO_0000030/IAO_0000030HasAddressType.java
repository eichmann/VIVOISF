package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030HasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030HasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030HasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030HasAddressIterator theIAO_0000030HasAddressIterator = (IAO_0000030HasAddressIterator)findAncestorWithClass(this, IAO_0000030HasAddressIterator.class);
			pageContext.getOut().print(theIAO_0000030HasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

