package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002CodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002CodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002CodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002CodeGAULIterator theBFO_0000002 = (BFO_0000002CodeGAULIterator)findAncestorWithClass(this, BFO_0000002CodeGAULIterator.class);
			pageContext.getOut().print(theBFO_0000002.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

