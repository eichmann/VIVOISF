package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialESIterator theterritory = (territoryNameOfficialESIterator)findAncestorWithClass(this, territoryNameOfficialESIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

