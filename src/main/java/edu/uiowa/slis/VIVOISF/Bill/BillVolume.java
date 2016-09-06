package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(BillVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillVolumeIterator theBill = (BillVolumeIterator)findAncestorWithClass(this, BillVolumeIterator.class);
			pageContext.getOut().print(theBill.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for volume tag ");
		}
		return SKIP_BODY;
	}
}

