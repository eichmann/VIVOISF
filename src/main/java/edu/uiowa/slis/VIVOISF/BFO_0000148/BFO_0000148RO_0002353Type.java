package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148RO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148RO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148RO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148RO_0002353Iterator theBFO_0000148RO_0002353Iterator = (BFO_0000148RO_0002353Iterator)findAncestorWithClass(this, BFO_0000148RO_0002353Iterator.class);
			pageContext.getOut().print(theBFO_0000148RO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

