package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionARG_2000028Iterator thePositionARG_2000028Iterator = (PositionARG_2000028Iterator)findAncestorWithClass(this, PositionARG_2000028Iterator.class);
			pageContext.getOut().print(thePositionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

