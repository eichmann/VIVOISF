package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001NameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001NameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001NameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001NameListRUIterator theBFO_0000001 = (BFO_0000001NameListRUIterator)findAncestorWithClass(this, BFO_0000001NameListRUIterator.class);
			pageContext.getOut().print(theBFO_0000001.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

