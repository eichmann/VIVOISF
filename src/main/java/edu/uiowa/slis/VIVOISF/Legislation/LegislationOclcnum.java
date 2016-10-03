package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationOclcnumIterator theLegislation = (LegislationOclcnumIterator)findAncestorWithClass(this, LegislationOclcnumIterator.class);
			pageContext.getOut().print(theLegislation.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

