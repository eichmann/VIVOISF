package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasAddressIterator theterritoryHasAddressIterator = (territoryHasAddressIterator)findAncestorWithClass(this, territoryHasAddressIterator.class);
			pageContext.getOut().print(theterritoryHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

