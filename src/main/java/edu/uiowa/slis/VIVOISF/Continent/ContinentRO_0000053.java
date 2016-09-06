package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRO_0000053Iterator theContinentRO_0000053Iterator = (ContinentRO_0000053Iterator)findAncestorWithClass(this, ContinentRO_0000053Iterator.class);
			pageContext.getOut().print(theContinentRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

