package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumPmidIterator theErratum = (ErratumPmidIterator)findAncestorWithClass(this, ErratumPmidIterator.class);
			pageContext.getOut().print(theErratum.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for pmid tag ");
		}
		return SKIP_BODY;
	}
}

