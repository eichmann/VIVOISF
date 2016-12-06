package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortARIterator theterritory = (territoryNameShortARIterator)findAncestorWithClass(this, territoryNameShortARIterator.class);
			pageContext.getOut().print(theterritory.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

