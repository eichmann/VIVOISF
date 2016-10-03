package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasShortNameIterator theterritory = (territoryHasShortNameIterator)findAncestorWithClass(this, territoryHasShortNameIterator.class);
			pageContext.getOut().print(theterritory.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

