package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008NameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008NameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008NameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008NameOfficialESIterator theBFO_0000008 = (BFO_0000008NameOfficialESIterator)findAncestorWithClass(this, BFO_0000008NameOfficialESIterator.class);
			pageContext.getOut().print(theBFO_0000008.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

