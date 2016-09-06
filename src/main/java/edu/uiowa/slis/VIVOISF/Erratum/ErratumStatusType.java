package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumStatusIterator theErratumStatusIterator = (ErratumStatusIterator)findAncestorWithClass(this, ErratumStatusIterator.class);
			pageContext.getOut().print(theErratumStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for status tag ");
		}
		return SKIP_BODY;
	}
}

