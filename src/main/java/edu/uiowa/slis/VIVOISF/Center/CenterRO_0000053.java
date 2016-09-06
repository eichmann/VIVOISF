package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterRO_0000053Iterator theCenterRO_0000053Iterator = (CenterRO_0000053Iterator)findAncestorWithClass(this, CenterRO_0000053Iterator.class);
			pageContext.getOut().print(theCenterRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

