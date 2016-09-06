package edu.uiowa.slis.VIVOISF.ARG_2000010;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000010RO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000010RO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000010RO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000010RO_0000057Iterator theARG_2000010RO_0000057Iterator = (ARG_2000010RO_0000057Iterator)findAncestorWithClass(this, ARG_2000010RO_0000057Iterator.class);
			pageContext.getOut().print(theARG_2000010RO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000010 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000010 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

