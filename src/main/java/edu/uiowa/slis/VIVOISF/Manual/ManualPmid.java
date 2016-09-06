package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualPmidIterator theManual = (ManualPmidIterator)findAncestorWithClass(this, ManualPmidIterator.class);
			pageContext.getOut().print(theManual.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for pmid tag ");
		}
		return SKIP_BODY;
	}
}

