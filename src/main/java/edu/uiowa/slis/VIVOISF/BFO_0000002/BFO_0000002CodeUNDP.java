package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002CodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002CodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002CodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002CodeUNDPIterator theBFO_0000002 = (BFO_0000002CodeUNDPIterator)findAncestorWithClass(this, BFO_0000002CodeUNDPIterator.class);
			pageContext.getOut().print(theBFO_0000002.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

