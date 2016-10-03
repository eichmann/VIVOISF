package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumShortDescriptionIterator theErratum = (ErratumShortDescriptionIterator)findAncestorWithClass(this, ErratumShortDescriptionIterator.class);
			pageContext.getOut().print(theErratum.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

