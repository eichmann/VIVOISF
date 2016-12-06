package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004NameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004NameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004NameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004NameListESIterator theBFO_0000004 = (BFO_0000004NameListESIterator)findAncestorWithClass(this, BFO_0000004NameListESIterator.class);
			pageContext.getOut().print(theBFO_0000004.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

