package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRO_0000056Iterator theterritoryRO_0000056Iterator = (territoryRO_0000056Iterator)findAncestorWithClass(this, territoryRO_0000056Iterator.class);
			pageContext.getOut().print(theterritoryRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

