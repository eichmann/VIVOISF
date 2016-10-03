package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationSici currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationSiciIterator theLegislation = (LegislationSiciIterator)findAncestorWithClass(this, LegislationSiciIterator.class);
			pageContext.getOut().print(theLegislation.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for sici tag ");
		}
		return SKIP_BODY;
	}
}

