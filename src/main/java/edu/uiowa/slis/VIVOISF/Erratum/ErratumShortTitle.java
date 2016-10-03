package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumShortTitleIterator theErratum = (ErratumShortTitleIterator)findAncestorWithClass(this, ErratumShortTitleIterator.class);
			pageContext.getOut().print(theErratum.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

