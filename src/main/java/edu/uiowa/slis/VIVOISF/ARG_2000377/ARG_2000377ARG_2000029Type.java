package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000377ARG_2000029Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377ARG_2000029Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377ARG_2000029Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000377ARG_2000029Iterator theARG_2000377ARG_2000029Iterator = (ARG_2000377ARG_2000029Iterator)findAncestorWithClass(this, ARG_2000377ARG_2000029Iterator.class);
			pageContext.getOut().print(theARG_2000377ARG_2000029Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

