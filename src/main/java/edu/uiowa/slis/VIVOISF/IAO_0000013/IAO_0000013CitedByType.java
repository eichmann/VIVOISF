package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013CitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013CitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013CitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013CitedByIterator theIAO_0000013CitedByIterator = (IAO_0000013CitedByIterator)findAncestorWithClass(this, IAO_0000013CitedByIterator.class);
			pageContext.getOut().print(theIAO_0000013CitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

