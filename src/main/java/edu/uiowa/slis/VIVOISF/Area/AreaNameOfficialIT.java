package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialITIterator theArea = (AreaNameOfficialITIterator)findAncestorWithClass(this, AreaNameOfficialITIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

