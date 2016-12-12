package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeISO2Iterator theArea = (AreaCodeISO2Iterator)findAncestorWithClass(this, AreaCodeISO2Iterator.class);
			pageContext.getOut().print(theArea.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

