package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280HasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280HasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280HasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280HasEmailIterator theUO_0000280HasEmailIterator = (UO_0000280HasEmailIterator)findAncestorWithClass(this, UO_0000280HasEmailIterator.class);
			pageContext.getOut().print(theUO_0000280HasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

