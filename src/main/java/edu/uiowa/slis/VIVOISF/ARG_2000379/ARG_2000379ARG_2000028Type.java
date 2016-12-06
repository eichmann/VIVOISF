package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379ARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379ARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379ARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379ARG_2000028Iterator theARG_2000379ARG_2000028Iterator = (ARG_2000379ARG_2000028Iterator)findAncestorWithClass(this, ARG_2000379ARG_2000028Iterator.class);
			pageContext.getOut().print(theARG_2000379ARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

