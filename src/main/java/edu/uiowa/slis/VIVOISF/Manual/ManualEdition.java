package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualEditionIterator theManual = (ManualEditionIterator)findAncestorWithClass(this, ManualEditionIterator.class);
			pageContext.getOut().print(theManual.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for edition tag ");
		}
		return SKIP_BODY;
	}
}
