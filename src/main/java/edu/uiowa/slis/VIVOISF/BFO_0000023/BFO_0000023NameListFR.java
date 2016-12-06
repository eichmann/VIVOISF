package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023NameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023NameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023NameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023NameListFRIterator theBFO_0000023 = (BFO_0000023NameListFRIterator)findAncestorWithClass(this, BFO_0000023NameListFRIterator.class);
			pageContext.getOut().print(theBFO_0000023.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

