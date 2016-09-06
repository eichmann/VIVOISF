package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillReproducesIterator theBillReproducesIterator = (BillReproducesIterator)findAncestorWithClass(this, BillReproducesIterator.class);
			pageContext.getOut().print(theBillReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

