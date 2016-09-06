package edu.uiowa.slis.VIVOISF.ARG_2000010;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000010OBI_0000293 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000010OBI_0000293 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000010OBI_0000293.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000010OBI_0000293Iterator theARG_2000010OBI_0000293Iterator = (ARG_2000010OBI_0000293Iterator)findAncestorWithClass(this, ARG_2000010OBI_0000293Iterator.class);
			pageContext.getOut().print(theARG_2000010OBI_0000293Iterator.getOBI_0000293());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000010 for OBI_0000293 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000010 for OBI_0000293 tag ");
		}
		return SKIP_BODY;
	}
}

