package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualCodenIterator theManual = (ManualCodenIterator)findAncestorWithClass(this, ManualCodenIterator.class);
			pageContext.getOut().print(theManual.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for coden tag ");
		}
		return SKIP_BODY;
	}
}

