package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualNumberIterator theManual = (ManualNumberIterator)findAncestorWithClass(this, ManualNumberIterator.class);
			pageContext.getOut().print(theManual.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for number tag ");
		}
		return SKIP_BODY;
	}
}

