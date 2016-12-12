package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AreaIsSuccessorOfIterator theAreaIsSuccessorOfIterator = (AreaIsSuccessorOfIterator)findAncestorWithClass(this, AreaIsSuccessorOfIterator.class);
			pageContext.getOut().print(theAreaIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

