package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006RO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006RO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006RO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006RO_0000053Iterator theBFO_0000006RO_0000053Iterator = (BFO_0000006RO_0000053Iterator)findAncestorWithClass(this, BFO_0000006RO_0000053Iterator.class);
			pageContext.getOut().print(theBFO_0000006RO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

