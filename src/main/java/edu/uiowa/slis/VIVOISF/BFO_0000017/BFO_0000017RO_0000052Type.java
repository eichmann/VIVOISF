package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017RO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017RO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017RO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017RO_0000052Iterator theBFO_0000017RO_0000052Iterator = (BFO_0000017RO_0000052Iterator)findAncestorWithClass(this, BFO_0000017RO_0000052Iterator.class);
			pageContext.getOut().print(theBFO_0000017RO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

