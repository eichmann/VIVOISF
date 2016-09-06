package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BillIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillIAO_0000136Iterator theBillIAO_0000136Iterator = (BillIAO_0000136Iterator)findAncestorWithClass(this, BillIAO_0000136Iterator.class);
			pageContext.getOut().print(theBillIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

