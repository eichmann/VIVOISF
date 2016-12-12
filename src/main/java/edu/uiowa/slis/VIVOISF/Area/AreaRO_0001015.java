package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AreaRO_0001015Iterator theAreaRO_0001015Iterator = (AreaRO_0001015Iterator)findAncestorWithClass(this, AreaRO_0001015Iterator.class);
			pageContext.getOut().print(theAreaRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

