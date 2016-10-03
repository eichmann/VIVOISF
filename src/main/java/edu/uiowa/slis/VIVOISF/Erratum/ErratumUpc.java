package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumUpcIterator theErratum = (ErratumUpcIterator)findAncestorWithClass(this, ErratumUpcIterator.class);
			pageContext.getOut().print(theErratum.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for upc tag ");
		}
		return SKIP_BODY;
	}
}

