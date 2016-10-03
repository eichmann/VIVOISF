package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperOclcnumIterator theConferencePaper = (ConferencePaperOclcnumIterator)findAncestorWithClass(this, ConferencePaperOclcnumIterator.class);
			pageContext.getOut().print(theConferencePaper.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

