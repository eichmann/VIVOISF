package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(areaIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaIsSuccessorOfIterator theareaIsSuccessorOfIterator = (areaIsSuccessorOfIterator)findAncestorWithClass(this, areaIsSuccessorOfIterator.class);
			pageContext.getOut().print(theareaIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing area for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

