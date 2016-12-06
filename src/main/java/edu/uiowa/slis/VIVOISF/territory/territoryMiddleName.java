package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryMiddleNameIterator theterritory = (territoryMiddleNameIterator)findAncestorWithClass(this, territoryMiddleNameIterator.class);
			pageContext.getOut().print(theterritory.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for middleName tag ");
		}
		return SKIP_BODY;
	}
}

