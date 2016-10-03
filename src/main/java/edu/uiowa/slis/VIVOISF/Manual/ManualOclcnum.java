package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualOclcnumIterator theManual = (ManualOclcnumIterator)findAncestorWithClass(this, ManualOclcnumIterator.class);
			pageContext.getOut().print(theManual.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

