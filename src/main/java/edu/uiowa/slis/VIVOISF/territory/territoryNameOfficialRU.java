package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialRUIterator theterritory = (territoryNameOfficialRUIterator)findAncestorWithClass(this, territoryNameOfficialRUIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

