package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteOclcnumIterator theStatute = (StatuteOclcnumIterator)findAncestorWithClass(this, StatuteOclcnumIterator.class);
			pageContext.getOut().print(theStatute.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

