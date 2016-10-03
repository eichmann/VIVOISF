package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumPageEndIterator theErratum = (ErratumPageEndIterator)findAncestorWithClass(this, ErratumPageEndIterator.class);
			pageContext.getOut().print(theErratum.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

