package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationStatusIterator theLegislationStatusIterator = (LegislationStatusIterator)findAncestorWithClass(this, LegislationStatusIterator.class);
			pageContext.getOut().print(theLegislationStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for status tag ");
		}
		return SKIP_BODY;
	}
}

