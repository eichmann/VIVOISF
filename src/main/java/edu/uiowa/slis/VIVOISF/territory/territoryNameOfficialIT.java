package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialITIterator theterritory = (territoryNameOfficialITIterator)findAncestorWithClass(this, territoryNameOfficialITIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

