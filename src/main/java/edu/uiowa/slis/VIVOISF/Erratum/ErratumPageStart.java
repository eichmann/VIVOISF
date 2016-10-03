package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumPageStartIterator theErratum = (ErratumPageStartIterator)findAncestorWithClass(this, ErratumPageStartIterator.class);
			pageContext.getOut().print(theErratum.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

