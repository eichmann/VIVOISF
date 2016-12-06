package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280NameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280NameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280NameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280NameListARIterator theUO_0000280 = (UO_0000280NameListARIterator)findAncestorWithClass(this, UO_0000280NameListARIterator.class);
			pageContext.getOut().print(theUO_0000280.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

