package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialFRIterator theterritory = (territoryNameOfficialFRIterator)findAncestorWithClass(this, territoryNameOfficialFRIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

