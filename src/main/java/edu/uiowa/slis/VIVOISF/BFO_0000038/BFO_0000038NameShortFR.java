package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038NameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038NameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038NameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038NameShortFRIterator theBFO_0000038 = (BFO_0000038NameShortFRIterator)findAncestorWithClass(this, BFO_0000038NameShortFRIterator.class);
			pageContext.getOut().print(theBFO_0000038.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

