package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001NameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001NameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001NameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001NameListZHIterator theBFO_0000001 = (BFO_0000001NameListZHIterator)findAncestorWithClass(this, BFO_0000001NameListZHIterator.class);
			pageContext.getOut().print(theBFO_0000001.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

