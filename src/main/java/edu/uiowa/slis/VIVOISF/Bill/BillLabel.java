package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BillLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			if (!theBill.commitNeeded) {
				pageContext.getOut().print(theBill.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			return theBill.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Bill for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			theBill.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for label tag ");
		}
	}
}

