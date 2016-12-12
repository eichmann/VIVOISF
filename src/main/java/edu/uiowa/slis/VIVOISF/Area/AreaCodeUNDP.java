package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeUNDPIterator theArea = (AreaCodeUNDPIterator)findAncestorWithClass(this, AreaCodeUNDPIterator.class);
			pageContext.getOut().print(theArea.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

