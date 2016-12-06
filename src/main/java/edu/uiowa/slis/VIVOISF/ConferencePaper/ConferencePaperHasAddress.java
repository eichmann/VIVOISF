package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasAddressIterator theConferencePaperHasAddressIterator = (ConferencePaperHasAddressIterator)findAncestorWithClass(this, ConferencePaperHasAddressIterator.class);
			pageContext.getOut().print(theConferencePaperHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

