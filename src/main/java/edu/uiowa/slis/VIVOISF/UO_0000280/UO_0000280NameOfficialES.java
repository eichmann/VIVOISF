package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280NameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280NameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280NameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280NameOfficialESIterator theUO_0000280 = (UO_0000280NameOfficialESIterator)findAncestorWithClass(this, UO_0000280NameOfficialESIterator.class);
			pageContext.getOut().print(theUO_0000280.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

