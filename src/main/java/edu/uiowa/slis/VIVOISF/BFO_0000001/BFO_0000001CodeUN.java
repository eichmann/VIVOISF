package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001CodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001CodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001CodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001CodeUNIterator theBFO_0000001 = (BFO_0000001CodeUNIterator)findAncestorWithClass(this, BFO_0000001CodeUNIterator.class);
			pageContext.getOut().print(theBFO_0000001.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

