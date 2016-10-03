package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualShortDescriptionIterator theManual = (ManualShortDescriptionIterator)findAncestorWithClass(this, ManualShortDescriptionIterator.class);
			pageContext.getOut().print(theManual.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

