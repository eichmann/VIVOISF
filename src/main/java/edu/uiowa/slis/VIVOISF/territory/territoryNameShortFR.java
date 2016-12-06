package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortFRIterator theterritory = (territoryNameShortFRIterator)findAncestorWithClass(this, territoryNameShortFRIterator.class);
			pageContext.getOut().print(theterritory.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

