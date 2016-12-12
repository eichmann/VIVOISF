package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialFRIterator theArea = (AreaNameOfficialFRIterator)findAncestorWithClass(this, AreaNameOfficialFRIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

