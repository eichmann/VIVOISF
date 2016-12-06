package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasAddressIterator theConferencePosterHasAddressIterator = (ConferencePosterHasAddressIterator)findAncestorWithClass(this, ConferencePosterHasAddressIterator.class);
			pageContext.getOut().print(theConferencePosterHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

