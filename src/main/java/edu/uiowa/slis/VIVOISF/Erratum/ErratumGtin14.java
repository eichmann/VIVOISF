package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumGtin14Iterator theErratum = (ErratumGtin14Iterator)findAncestorWithClass(this, ErratumGtin14Iterator.class);
			pageContext.getOut().print(theErratum.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

