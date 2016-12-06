package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasNameIterator theterritoryHasNameIterator = (territoryHasNameIterator)findAncestorWithClass(this, territoryHasNameIterator.class);
			pageContext.getOut().print(theterritoryHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasName tag ");
		}
		return SKIP_BODY;
	}
}

