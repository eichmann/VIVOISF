package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRO_0000056Iterator theContinentRO_0000056Iterator = (ContinentRO_0000056Iterator)findAncestorWithClass(this, ContinentRO_0000056Iterator.class);
			pageContext.getOut().print(theContinentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

