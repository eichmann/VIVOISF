package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortITIterator theArea = (AreaNameShortITIterator)findAncestorWithClass(this, AreaNameShortITIterator.class);
			pageContext.getOut().print(theArea.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

