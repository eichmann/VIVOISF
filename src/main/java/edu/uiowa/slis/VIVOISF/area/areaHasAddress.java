package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasAddressIterator theareaHasAddressIterator = (areaHasAddressIterator)findAncestorWithClass(this, areaHasAddressIterator.class);
			pageContext.getOut().print(theareaHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

