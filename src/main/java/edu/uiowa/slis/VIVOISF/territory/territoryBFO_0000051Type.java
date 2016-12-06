package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryBFO_0000051Iterator theterritoryBFO_0000051Iterator = (territoryBFO_0000051Iterator)findAncestorWithClass(this, territoryBFO_0000051Iterator.class);
			pageContext.getOut().print(theterritoryBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

