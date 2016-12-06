package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListFRIterator theterritory = (territoryNameListFRIterator)findAncestorWithClass(this, territoryNameListFRIterator.class);
			pageContext.getOut().print(theterritory.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

