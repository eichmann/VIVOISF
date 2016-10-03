package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualSiciIterator theManual = (ManualSiciIterator)findAncestorWithClass(this, ManualSiciIterator.class);
			pageContext.getOut().print(theManual.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for sici tag ");
		}
		return SKIP_BODY;
	}
}

