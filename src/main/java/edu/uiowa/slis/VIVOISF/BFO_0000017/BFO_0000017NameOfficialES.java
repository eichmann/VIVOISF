package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017NameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017NameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017NameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017NameOfficialESIterator theBFO_0000017 = (BFO_0000017NameOfficialESIterator)findAncestorWithClass(this, BFO_0000017NameOfficialESIterator.class);
			pageContext.getOut().print(theBFO_0000017.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

