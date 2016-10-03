package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumNumPagesIterator theErratum = (ErratumNumPagesIterator)findAncestorWithClass(this, ErratumNumPagesIterator.class);
			pageContext.getOut().print(theErratum.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for numPages tag ");
		}
		return SKIP_BODY;
	}
}

