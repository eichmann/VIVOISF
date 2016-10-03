package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumOwnerIterator theErratumOwnerIterator = (ErratumOwnerIterator)findAncestorWithClass(this, ErratumOwnerIterator.class);
			pageContext.getOut().print(theErratumOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for owner tag ");
		}
		return SKIP_BODY;
	}
}

