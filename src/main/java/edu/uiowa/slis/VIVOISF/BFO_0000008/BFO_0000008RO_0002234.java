package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008RO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008RO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008RO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008RO_0002234Iterator theBFO_0000008RO_0002234Iterator = (BFO_0000008RO_0002234Iterator)findAncestorWithClass(this, BFO_0000008RO_0002234Iterator.class);
			pageContext.getOut().print(theBFO_0000008RO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

