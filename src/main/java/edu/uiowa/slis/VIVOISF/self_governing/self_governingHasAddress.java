package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasAddressIterator theself_governingHasAddressIterator = (self_governingHasAddressIterator)findAncestorWithClass(this, self_governingHasAddressIterator.class);
			pageContext.getOut().print(theself_governingHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

