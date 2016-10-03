package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumPagesIterator theErratum = (ErratumPagesIterator)findAncestorWithClass(this, ErratumPagesIterator.class);
			pageContext.getOut().print(theErratum.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for pages tag ");
		}
		return SKIP_BODY;
	}
}

