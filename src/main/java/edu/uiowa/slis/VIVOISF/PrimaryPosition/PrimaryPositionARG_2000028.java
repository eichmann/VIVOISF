package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionARG_2000028Iterator thePrimaryPositionARG_2000028Iterator = (PrimaryPositionARG_2000028Iterator)findAncestorWithClass(this, PrimaryPositionARG_2000028Iterator.class);
			pageContext.getOut().print(thePrimaryPositionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

