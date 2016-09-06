package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationRO_0000056Iterator theLegislationRO_0000056Iterator = (LegislationRO_0000056Iterator)findAncestorWithClass(this, LegislationRO_0000056Iterator.class);
			pageContext.getOut().print(theLegislationRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

