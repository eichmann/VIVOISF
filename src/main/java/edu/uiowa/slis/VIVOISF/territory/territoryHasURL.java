package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasURLIterator theterritoryHasURLIterator = (territoryHasURLIterator)findAncestorWithClass(this, territoryHasURLIterator.class);
			pageContext.getOut().print(theterritoryHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

