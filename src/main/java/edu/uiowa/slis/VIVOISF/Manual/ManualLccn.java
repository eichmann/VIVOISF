package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualLccnIterator theManual = (ManualLccnIterator)findAncestorWithClass(this, ManualLccnIterator.class);
			pageContext.getOut().print(theManual.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for lccn tag ");
		}
		return SKIP_BODY;
	}
}

