package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortZHIterator theterritory = (territoryNameShortZHIterator)findAncestorWithClass(this, territoryNameShortZHIterator.class);
			pageContext.getOut().print(theterritory.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

