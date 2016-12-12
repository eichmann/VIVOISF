package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialZHIterator theArea = (AreaNameOfficialZHIterator)findAncestorWithClass(this, AreaNameOfficialZHIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

