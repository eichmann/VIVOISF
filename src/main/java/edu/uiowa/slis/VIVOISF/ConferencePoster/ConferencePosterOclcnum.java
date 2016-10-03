package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterOclcnumIterator theConferencePoster = (ConferencePosterOclcnumIterator)findAncestorWithClass(this, ConferencePosterOclcnumIterator.class);
			pageContext.getOut().print(theConferencePoster.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

