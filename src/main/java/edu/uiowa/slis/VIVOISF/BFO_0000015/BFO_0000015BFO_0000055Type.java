package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015BFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015BFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015BFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015BFO_0000055Iterator theBFO_0000015BFO_0000055Iterator = (BFO_0000015BFO_0000055Iterator)findAncestorWithClass(this, BFO_0000015BFO_0000055Iterator.class);
			pageContext.getOut().print(theBFO_0000015BFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

