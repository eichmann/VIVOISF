package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialZHIterator theterritory = (territoryNameOfficialZHIterator)findAncestorWithClass(this, territoryNameOfficialZHIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

