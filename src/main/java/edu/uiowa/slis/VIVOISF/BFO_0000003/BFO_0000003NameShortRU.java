package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003NameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003NameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003NameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003NameShortRUIterator theBFO_0000003 = (BFO_0000003NameShortRUIterator)findAncestorWithClass(this, BFO_0000003NameShortRUIterator.class);
			pageContext.getOut().print(theBFO_0000003.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

