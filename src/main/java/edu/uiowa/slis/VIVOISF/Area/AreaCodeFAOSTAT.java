package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeFAOSTATIterator theArea = (AreaCodeFAOSTATIterator)findAncestorWithClass(this, AreaCodeFAOSTATIterator.class);
			pageContext.getOut().print(theArea.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

