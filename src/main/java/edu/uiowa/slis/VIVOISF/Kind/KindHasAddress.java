package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasAddressIterator theKindHasAddressIterator = (KindHasAddressIterator)findAncestorWithClass(this, KindHasAddressIterator.class);
			pageContext.getOut().print(theKindHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

