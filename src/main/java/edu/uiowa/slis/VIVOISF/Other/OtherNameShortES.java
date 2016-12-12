package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortESIterator theOther = (OtherNameShortESIterator)findAncestorWithClass(this, OtherNameShortESIterator.class);
			pageContext.getOut().print(theOther.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

