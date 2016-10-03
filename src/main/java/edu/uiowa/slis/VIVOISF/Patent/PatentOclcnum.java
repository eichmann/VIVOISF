package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentOclcnumIterator thePatent = (PatentOclcnumIterator)findAncestorWithClass(this, PatentOclcnumIterator.class);
			pageContext.getOut().print(thePatent.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

