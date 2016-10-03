package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardSici currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardSiciIterator theStandard = (StandardSiciIterator)findAncestorWithClass(this, StandardSiciIterator.class);
			pageContext.getOut().print(theStandard.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for sici tag ");
		}
		return SKIP_BODY;
	}
}

