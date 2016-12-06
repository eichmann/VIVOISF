package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRO_0001025Iterator theContinentRO_0001025Iterator = (ContinentRO_0001025Iterator)findAncestorWithClass(this, ContinentRO_0001025Iterator.class);
			pageContext.getOut().print(theContinentRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

