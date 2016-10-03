package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationOwnerIterator theLegislationOwnerIterator = (LegislationOwnerIterator)findAncestorWithClass(this, LegislationOwnerIterator.class);
			pageContext.getOut().print(theLegislationOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for owner tag ");
		}
		return SKIP_BODY;
	}
}

