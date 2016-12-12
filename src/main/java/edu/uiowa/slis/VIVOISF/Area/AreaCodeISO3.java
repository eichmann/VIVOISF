package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeISO3Iterator theArea = (AreaCodeISO3Iterator)findAncestorWithClass(this, AreaCodeISO3Iterator.class);
			pageContext.getOut().print(theArea.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

