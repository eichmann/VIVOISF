package edu.uiowa.slis.VIVOISF.BFO_0000040;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000040RO_0003001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000040RO_0003001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000040RO_0003001.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000040RO_0003001Iterator theBFO_0000040RO_0003001Iterator = (BFO_0000040RO_0003001Iterator)findAncestorWithClass(this, BFO_0000040RO_0003001Iterator.class);
			pageContext.getOut().print(theBFO_0000040RO_0003001Iterator.getRO_0003001());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000040 for RO_0003001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000040 for RO_0003001 tag ");
		}
		return SKIP_BODY;
	}
}

