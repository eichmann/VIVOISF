package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HasAddressIterator theIAO_0000003HasAddressIterator = (IAO_0000003HasAddressIterator)findAncestorWithClass(this, IAO_0000003HasAddressIterator.class);
			pageContext.getOut().print(theIAO_0000003HasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

