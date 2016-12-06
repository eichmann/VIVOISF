package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280ARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280ARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280ARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280ARG_2000028Iterator theUO_0000280ARG_2000028Iterator = (UO_0000280ARG_2000028Iterator)findAncestorWithClass(this, UO_0000280ARG_2000028Iterator.class);
			pageContext.getOut().print(theUO_0000280ARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

