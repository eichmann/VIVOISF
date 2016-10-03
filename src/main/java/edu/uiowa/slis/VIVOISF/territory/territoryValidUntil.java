package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryValidUntilIterator theterritory = (territoryValidUntilIterator)findAncestorWithClass(this, territoryValidUntilIterator.class);
			pageContext.getOut().print(theterritory.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

