package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialARIterator theArea = (AreaNameOfficialARIterator)findAncestorWithClass(this, AreaNameOfficialARIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

