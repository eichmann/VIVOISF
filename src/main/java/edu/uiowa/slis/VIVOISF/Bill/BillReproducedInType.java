package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillReproducedInIterator theBillReproducedInIterator = (BillReproducedInIterator)findAncestorWithClass(this, BillReproducedInIterator.class);
			pageContext.getOut().print(theBillReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

