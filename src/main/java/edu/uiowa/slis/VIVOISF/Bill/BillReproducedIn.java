package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(BillReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillReproducedInIterator theBillReproducedInIterator = (BillReproducedInIterator)findAncestorWithClass(this, BillReproducedInIterator.class);
			pageContext.getOut().print(theBillReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

