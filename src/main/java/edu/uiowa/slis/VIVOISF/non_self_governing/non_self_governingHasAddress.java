package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasAddressIterator thenon_self_governingHasAddressIterator = (non_self_governingHasAddressIterator)findAncestorWithClass(this, non_self_governingHasAddressIterator.class);
			pageContext.getOut().print(thenon_self_governingHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

