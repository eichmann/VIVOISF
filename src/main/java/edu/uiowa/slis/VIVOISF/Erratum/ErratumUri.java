package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumUriIterator theErratum = (ErratumUriIterator)findAncestorWithClass(this, ErratumUriIterator.class);
			pageContext.getOut().print(theErratum.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for uri tag ");
		}
		return SKIP_BODY;
	}
}

