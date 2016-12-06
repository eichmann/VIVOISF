package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasAddressIterator theConferencePaperHasAddressIterator = (ConferencePaperHasAddressIterator)findAncestorWithClass(this, ConferencePaperHasAddressIterator.class);
			pageContext.getOut().print(theConferencePaperHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

