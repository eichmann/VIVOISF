package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceOclcnumIterator theReferenceSource = (ReferenceSourceOclcnumIterator)findAncestorWithClass(this, ReferenceSourceOclcnumIterator.class);
			pageContext.getOut().print(theReferenceSource.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

