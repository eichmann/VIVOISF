package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280NameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280NameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280NameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280NameListFRIterator theUO_0000280 = (UO_0000280NameListFRIterator)findAncestorWithClass(this, UO_0000280NameListFRIterator.class);
			pageContext.getOut().print(theUO_0000280.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}
