package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasEmailIterator theterritoryHasEmailIterator = (territoryHasEmailIterator)findAncestorWithClass(this, territoryHasEmailIterator.class);
			pageContext.getOut().print(theterritoryHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

