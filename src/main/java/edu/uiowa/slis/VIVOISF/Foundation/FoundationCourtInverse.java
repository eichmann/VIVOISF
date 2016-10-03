package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationCourtInverseIterator theFoundationCourtInverseIterator = (FoundationCourtInverseIterator)findAncestorWithClass(this, FoundationCourtInverseIterator.class);
			pageContext.getOut().print(theFoundationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for court tag ");
		}
		return SKIP_BODY;
	}
}

