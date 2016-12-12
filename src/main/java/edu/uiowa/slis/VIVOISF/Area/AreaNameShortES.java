package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortESIterator theArea = (AreaNameShortESIterator)findAncestorWithClass(this, AreaNameShortESIterator.class);
			pageContext.getOut().print(theArea.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

