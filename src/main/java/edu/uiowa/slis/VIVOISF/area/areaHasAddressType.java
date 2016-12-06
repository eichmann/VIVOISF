package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasAddressIterator theareaHasAddressIterator = (areaHasAddressIterator)findAncestorWithClass(this, areaHasAddressIterator.class);
			pageContext.getOut().print(theareaHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

