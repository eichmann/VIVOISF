package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Oclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Oclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Oclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013OclcnumIterator theIAO_0000013 = (IAO_0000013OclcnumIterator)findAncestorWithClass(this, IAO_0000013OclcnumIterator.class);
			pageContext.getOut().print(theIAO_0000013.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

