package edu.uiowa.slis.VIVOISF.ARG_2000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000011OBI_0000417 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000011OBI_0000417 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000011OBI_0000417.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000011OBI_0000417Iterator theARG_2000011OBI_0000417Iterator = (ARG_2000011OBI_0000417Iterator)findAncestorWithClass(this, ARG_2000011OBI_0000417Iterator.class);
			pageContext.getOut().print(theARG_2000011OBI_0000417Iterator.getOBI_0000417());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000011 for OBI_0000417 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000011 for OBI_0000417 tag ");
		}
		return SKIP_BODY;
	}
}

