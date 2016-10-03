package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumAsinIterator theErratum = (ErratumAsinIterator)findAncestorWithClass(this, ErratumAsinIterator.class);
			pageContext.getOut().print(theErratum.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for asin tag ");
		}
		return SKIP_BODY;
	}
}

