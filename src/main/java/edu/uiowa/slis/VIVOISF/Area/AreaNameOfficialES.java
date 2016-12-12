package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialESIterator theArea = (AreaNameOfficialESIterator)findAncestorWithClass(this, AreaNameOfficialESIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

