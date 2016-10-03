package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillDistributorIterator theBillDistributorIterator = (BillDistributorIterator)findAncestorWithClass(this, BillDistributorIterator.class);
			pageContext.getOut().print(theBillDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for distributor tag ");
		}
		return SKIP_BODY;
	}
}

