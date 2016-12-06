package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialARIterator theterritory = (territoryNameOfficialARIterator)findAncestorWithClass(this, territoryNameOfficialARIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

