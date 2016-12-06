package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148NameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148NameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148NameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148NameShortITIterator theBFO_0000148 = (BFO_0000148NameShortITIterator)findAncestorWithClass(this, BFO_0000148NameShortITIterator.class);
			pageContext.getOut().print(theBFO_0000148.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

